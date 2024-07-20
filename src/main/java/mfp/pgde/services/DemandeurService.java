package mfp.pgde.services;

import mfp.pgde.dto.DemandeurDto;
import mfp.pgde.entities.Demandeur;

import java.util.List;

public interface DemandeurService extends PagableDemandeurService {
    Long create(DemandeurDto demandeurDto);
    DemandeurDto update(DemandeurDto demandeurDto);
    List<Demandeur> getAllDemandeurs();
    DemandeurDto getById(Long id);
    void delete(Long id);
    Demandeur findDemandeurByUser(Long id);
    DemandeurDto findDemandeurByUsername(String username);
    DemandeurDto convertEntityToDto(Demandeur demandeur);
    Demandeur convertDtoToEntity(DemandeurDto demandeurDto);
}
