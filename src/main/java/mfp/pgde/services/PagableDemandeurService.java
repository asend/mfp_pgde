package mfp.pgde.services;

import mfp.pgde.dto.DemandeurDto;
import org.springframework.data.domain.Page;

public interface PagableDemandeurService {
    Page<DemandeurDto> getAll(int page, int size);
}
