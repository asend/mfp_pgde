package mfp.pgde.services;

import mfp.pgde.dto.EmploiDto;
import mfp.pgde.dto.SecteurDto;
import mfp.pgde.entities.Emploi;
import mfp.pgde.entities.Secteur;
import mfp.pgde.repositories.SecteurRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SecteurServiceImpl implements SecteurService {
    @Autowired
    SecteurRepository secteurRepository;

    @Autowired
    EmploiService emploiService;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public Secteur create(Secteur secteur) {
        return secteurRepository.save(secteur);
    }

    @Override
    public Secteur update(Secteur secteur) {
        return secteurRepository.save(secteur);
    }

    @Override
    public List<SecteurDto> getAllSecteurs() {

        return secteurRepository.findAll().stream().map(this::convertEntityToDto).collect(Collectors.toList());
    }

    @Override
    public SecteurDto getById(Long id) {

        return convertEntityToDto(secteurRepository.findById(id).orElse(null));
    }

    @Override
    public void delete(Long id) {
        secteurRepository.deleteById(id);
    }

    @Override
    public SecteurDto convertEntityToDto(Secteur secteur) {
        /*modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        SecteurDto secteurDto = modelMapper.map(secteur, SecteurDto.class);
        return secteurDto;*/
        return SecteurDto.builder()
                .id(secteur.getId())
                .libelle(secteur.getLibelle())
                .emploiDtos(secteur.getEmplois()
                        .stream()
                        .map(emploiService::convertEntityToDto)
                        .collect(Collectors.toList()))
                .build();
    }

    @Override
    public Secteur convertDtoToEntity(SecteurDto secteurDto) {
        /*Secteur secteur = new Secteur();
        secteur = modelMapper.map(secteurDto, Secteur.class);
        return secteur;*/
        return Secteur.builder()
                .id(secteurDto.getId())
                .libelle(secteurDto.getLibelle())
                .build();
    }
}
