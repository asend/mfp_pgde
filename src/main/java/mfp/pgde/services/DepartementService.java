package mfp.pgde.services;

import mfp.pgde.entities.Departement;

import java.util.List;

public interface DepartementService {
    Departement create(Departement departement);
    Departement update(Departement departement);
    List<Departement> getAllDepartement();
    void delete(Long id);
    Departement getById(Long id);

}
