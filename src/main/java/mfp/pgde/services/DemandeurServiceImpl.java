package mfp.pgde.services;

import mfp.pgde.dto.DemandeurDto;
import mfp.pgde.entities.Demandeur;
import mfp.pgde.repositories.DemandeurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DemandeurServiceImpl implements DemandeurService {
    @Autowired
    DemandeurRepository demandeurRepository;

    @Autowired
    EmploiService emploiService;

    @Autowired
    SecteurService secteurService;

    @Override
    public Long create(DemandeurDto demandeurDto) {
        Demandeur demandeur = convertDtoToEntity(demandeurDto);
        return demandeurRepository.save(demandeur).getId();
    }

    @Override
    public DemandeurDto update(DemandeurDto demandeurDto) {
        Demandeur demandeur = convertDtoToEntity(demandeurDto);
        return convertEntityToDto(demandeurRepository.save(demandeur));
    }

    @Override
    public List<Demandeur> getAllDemandeurs() {
        return demandeurRepository.findAll();
    }

    @Override
    public DemandeurDto getById(Long id) {
        return convertEntityToDto(demandeurRepository.findById(id).orElse(null));
    }

    @Override
    public void delete(Long id) {
        demandeurRepository.deleteById(id);
    }

    @Override
    public Demandeur findDemandeurByUser(Long id) {
        return demandeurRepository.findDemandeurByUserId(id).orElse(null);
    }

    @Override
    public DemandeurDto findDemandeurByUsername(String username) {
        return convertEntityToDto(demandeurRepository.findDemandeurByUsername(username).orElse(null));
    }

    @Override
    public DemandeurDto convertEntityToDto(Demandeur demandeur) {
        return DemandeurDto.builder()
                .id(demandeur.getId())
                .adresse(demandeur.getAdresse())
                .anne_diplome(demandeur.getAnne_diplome())
                .autre_diplome(demandeur.getAutre_diplome())
                .code(demandeur.getCode())
                .date_naissance(demandeur.getDate_naissance())
                .departement_naissance_id(demandeur.getDepartement_naissance_id())
                .departement_residense_id(demandeur.getDepartement_residense_id())
                .etablissement_diplome(demandeur.getEtablissement_diplome())
                .formation(demandeur.getFormation())
                .intitule_diplome(demandeur.getIntitule_diplome())
                .lieu_naissance(demandeur.getLieu_naissance())
                .sexe(demandeur.getSexe())
                .situation_matrimoiniale(demandeur.getSituation_matrimoiniale())
                .specialite(demandeur.getSpecialite())
                .status(demandeur.getStatus())
                .telephone(demandeur.getTelephone())
                .region_naissance_id(demandeur.getRegion_naissance_id())
                .region_residense_id(demandeur.getRegion_residense_id())
                .nombre_enfant(demandeur.getNombre_enfant())
                .images(demandeur.getImages())
                .emplois(demandeur.getEmplois().stream().map(emploiService::convertEntityToDto).collect(Collectors.toList()))
                .secteurs(demandeur.getSecteurs().stream().map(secteurService::convertEntityToDto).collect(Collectors.toList()))
                .handicaps(demandeur.getHandicaps())
                .proces_verbal(demandeur.getProces_verbal())
                .username(demandeur.getUsername())
                .user(demandeur.getUserId())
                .build();
    }

    @Override
    public Demandeur convertDtoToEntity(DemandeurDto demandeurDto) {

        return Demandeur.builder()
                .id(demandeurDto.getId())
                .adresse(demandeurDto.getAdresse())
                .anne_diplome(demandeurDto.getAnne_diplome())
                .autre_diplome(demandeurDto.getAutre_diplome())
                .code(demandeurDto.getCode())
                .date_naissance(demandeurDto.getDate_naissance())
                .departement_naissance_id(demandeurDto.getDepartement_naissance_id())
                .departement_residense_id(demandeurDto.getDepartement_residense_id())
                .etablissement_diplome(demandeurDto.getEtablissement_diplome())
                .formation(demandeurDto.getFormation())
                .intitule_diplome(demandeurDto.getIntitule_diplome())
                .lieu_naissance(demandeurDto.getLieu_naissance())
                .sexe(demandeurDto.getSexe())
                .situation_matrimoiniale(demandeurDto.getSituation_matrimoiniale())
                .specialite(demandeurDto.getSpecialite())
                .status(demandeurDto.getStatus())
                .telephone(demandeurDto.getTelephone())
                .region_naissance_id(demandeurDto.getRegion_naissance_id())
                .region_residense_id(demandeurDto.getRegion_residense_id())
                .nombre_enfant(demandeurDto.getNombre_enfant())
                .images(demandeurDto.getImages())
                .emplois(demandeurDto.getEmplois().stream().map(emploiService::convertDtoToEntity).collect(Collectors.toList()))
                .secteurs(demandeurDto.getSecteurs().stream().map(secteurService::convertDtoToEntity).collect(Collectors.toList()))
                .handicaps(demandeurDto.getHandicaps())
                .proces_verbal(demandeurDto.getProces_verbal())
                .username(demandeurDto.getUsername())
                .userId(demandeurDto.getUser())
                .build();
    }

    @Override
    public Page<DemandeurDto> getAll(int page, int size) {
       // return null;
       // logger.info("Page PROMOTIONS");
        PageRequest pageRequest = PageRequest.of(page, size);
        Page<Demandeur> demandeurs = this.demandeurRepository.findAll(pageRequest);
        Page<DemandeurDto> demandeurDtos = demandeurs.map(this::convertEntityToDto);//.collect(Collectors.toList());// .map(PromotionMapper.INSTANCE::toDto);
        return demandeurDtos;
    }
}

