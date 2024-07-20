package mfp.pgde.services;

import mfp.pgde.dto.EmploiDto;
import mfp.pgde.entities.Emploi;

import java.util.List;

public interface EmploiService {
    EmploiDto create(EmploiDto emploi);
    EmploiDto update(EmploiDto emploi);
    List<EmploiDto> getAllEmplois();
    EmploiDto getById(Long id);
    void delete(Long id);
    EmploiDto convertEntityToDto(Emploi emploi);
    Emploi convertDtoToEntity(EmploiDto emploiDto);
}
