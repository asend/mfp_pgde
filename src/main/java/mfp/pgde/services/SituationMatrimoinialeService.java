package mfp.pgde.services;

import mfp.pgde.entities.SituationMatrimoiniale;

import java.util.List;

public interface SituationMatrimoinialeService {

    SituationMatrimoiniale create(SituationMatrimoiniale situationMatrimoiniale);
    SituationMatrimoiniale update(SituationMatrimoiniale situationMatrimoiniale);
    List<SituationMatrimoiniale> getAllSituationMatrimoiniales();
    SituationMatrimoiniale getById(Long id);
    void delete(Long id);
}
