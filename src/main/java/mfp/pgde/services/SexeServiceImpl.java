package mfp.pgde.services;

import mfp.pgde.entities.Secteur;
import mfp.pgde.entities.Sexe;
import mfp.pgde.repositories.SecteurRepository;
import mfp.pgde.repositories.SexeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SexeServiceImpl implements SexeService {
    @Autowired
    SexeRepository sexeRepository;

    @Override
    public Sexe create(Sexe sexe) {
        return sexeRepository.save(sexe);
    }

    @Override
    public Sexe update(Sexe sexe) {
        return sexeRepository.save(sexe);
    }

    @Override
    public List<Sexe> getAllSexes() {
        return sexeRepository.findAll();
    }

    @Override
    public Sexe getById(Long id) {
        return sexeRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        sexeRepository.deleteById(id);
    }
}
