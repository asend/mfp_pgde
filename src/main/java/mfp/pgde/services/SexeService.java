package mfp.pgde.services;

import mfp.pgde.entities.Sexe;

import java.util.List;

public interface SexeService {

    Sexe create(Sexe sexe);
    Sexe update(Sexe sexe);
    List<Sexe> getAllSexes();
    Sexe getById(Long id);
    void delete(Long id);
}
