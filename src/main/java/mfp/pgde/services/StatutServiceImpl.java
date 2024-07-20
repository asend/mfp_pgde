package mfp.pgde.services;

import mfp.pgde.entities.Statut;
import mfp.pgde.repositories.StatutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatutServiceImpl implements StatutService {
    @Autowired
    StatutRepository statutRepository;
    @Override
    public Statut create(Statut statut) {
        return statutRepository.save(statut);
    }

    @Override
    public Statut update(Statut statut) {
        return statutRepository.save(statut);
    }

    @Override
    public List<Statut> getAllStatus() {
        return statutRepository.findAll();
    }

    @Override
    public Statut getById(Long id) {
        return statutRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        statutRepository.deleteById(id);
    }
}
