package mfp.pgde.services;

import mfp.pgde.entities.Formation;

import java.util.List;

public interface FormationService {
    Formation create(Formation formation);
    Formation update(Formation formation);
    List<Formation> getAllFormation();
    void delete(Long formation);
    Formation getById(Long id);
}
