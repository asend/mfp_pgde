package mfp.pgde.services;

import lombok.RequiredArgsConstructor;
import mfp.pgde.dto.EmploiDto;
import mfp.pgde.dto.SecteurDto;
import mfp.pgde.entities.Emploi;
import mfp.pgde.entities.Secteur;
import mfp.pgde.repositories.EmploiRepository;
import mfp.pgde.validators.ObjectValidator;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EmploiServiceImpl implements EmploiService{
    @Autowired
    EmploiRepository emploiRepository;
    @Autowired
    ObjectValidator<EmploiDto> validator;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public EmploiDto create(EmploiDto emploi) {
        validator.validate(emploi);
        return convertEntityToDto(emploiRepository.save(convertDtoToEntity(emploi)));
    }

    @Override
    public EmploiDto update(EmploiDto emploi) {
        return convertEntityToDto(emploiRepository.save(convertDtoToEntity(emploi)));
    }

    @Override
    public List<EmploiDto> getAllEmplois() {
        return emploiRepository.findAll().stream().map(this::convertEntityToDto).collect(Collectors.toList());
    }

    @Override
    public EmploiDto getById(Long id) {
        return convertEntityToDto(emploiRepository.findById(id).orElse(null));
    }

    @Override
    public void delete(Long id) {
        emploiRepository.deleteById(id);
    }

    @Override
    public EmploiDto convertEntityToDto(Emploi emploi) {
        //modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        //EmploiDto emploiDto = modelMapper.map(emploi, EmploiDto.class);
        //return emploiDto;
        return EmploiDto.builder()
                .id(emploi.getId())
                .libelle(emploi.getLibelle())
                .libelleSecteur(emploi.getSecteur().getLibelle())
                .idSecteur(emploi.getSecteur().getId())
                .secteur(
                        SecteurDto.builder()
                                .id(emploi.getSecteur().getId())
                                .build()
                )
                .build();
    }

    @Override
    public Emploi convertDtoToEntity(EmploiDto emploiDto) {
        /*Emploi emploi = new Emploi();
        emploi.setId(emploiDto.getId());
        emploi.setLibelle(emploi.getLibelle());
        return emploi;*/
        /*emploi = modelMapper.map(emploiDto, Emploi.class);
        return emploi;*/
        return Emploi.builder()
                .id(emploiDto.getId())
                .libelle(emploiDto.getLibelle())
                .secteur(
                        Secteur.builder()
                                .id(emploiDto.getSecteur().getId())
                                .build()
                )
                .build();
    }
}
