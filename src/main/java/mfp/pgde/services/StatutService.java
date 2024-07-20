package mfp.pgde.services;

import mfp.pgde.entities.Statut;

import java.util.List;

public interface StatutService {

    Statut create(Statut statut);
    Statut update(Statut statut);
    List<Statut> getAllStatus();
    Statut getById(Long id);
    void delete(Long id);
}
