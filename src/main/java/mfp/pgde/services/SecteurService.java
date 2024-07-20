package mfp.pgde.services;

import mfp.pgde.dto.EmploiDto;
import mfp.pgde.dto.SecteurDto;
import mfp.pgde.entities.Emploi;
import mfp.pgde.entities.Secteur;

import java.util.List;

public interface SecteurService {
    Secteur create(Secteur secteur);
    Secteur update(Secteur secteur);
    List<SecteurDto> getAllSecteurs();
    SecteurDto getById(Long id);
    void delete(Long id);
    SecteurDto convertEntityToDto(Secteur secteur);
    Secteur convertDtoToEntity(SecteurDto secteurDto);
}
