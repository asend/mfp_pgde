package mfp.pgde.services;

import mfp.pgde.entities.Departement;
import mfp.pgde.repositories.DepartementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartementServiceImpl implements DepartementService {
    @Autowired
    DepartementRepository departementRepository;
    @Override
    public Departement create(Departement departement) {
        return departementRepository.save(departement);
    }

    @Override
    public Departement update(Departement departement) {
        return departementRepository.save(departement);
    }

    @Override
    public List<Departement> getAllDepartement() {
        return departementRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        departementRepository.deleteById(id);
    }

    @Override
    public Departement getById(Long id) {
        return departementRepository.findById(id).orElse(null);
    }
}
