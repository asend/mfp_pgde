package mfp.pgde.services;

import mfp.pgde.entities.Formation;
import mfp.pgde.repositories.FormationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormationServiceImpl implements FormationService{
    @Autowired
    FormationRepository formationRepository;
    @Override
    public Formation create(Formation formation) {
        return formationRepository.save(formation);
    }

    @Override
    public Formation update(Formation formation) {
        return formationRepository.save(formation);
    }

    @Override
    public List<Formation> getAllFormation() {
        return formationRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        formationRepository.deleteById(id);
    }

    @Override
    public Formation getById(Long id) {
        return formationRepository.findById(id).orElse(null);
    }
}
