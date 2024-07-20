package mfp.pgde.services;

import mfp.pgde.entities.SituationMatrimoiniale;
import mfp.pgde.repositories.SituationMatrimonialeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SituationMatrimoinialeServiceImpl implements SituationMatrimoinialeService{
    @Autowired
    SituationMatrimonialeRepository situationMatrimonialeRepository;
    @Override
    public SituationMatrimoiniale create(SituationMatrimoiniale situationMatrimoiniale) {
        return situationMatrimonialeRepository.save(situationMatrimoiniale);
    }

    @Override
    public SituationMatrimoiniale update(SituationMatrimoiniale situationMatrimoiniale) {
        return situationMatrimonialeRepository.save(situationMatrimoiniale);
    }

    @Override
    public List<SituationMatrimoiniale> getAllSituationMatrimoiniales() {
        return situationMatrimonialeRepository.findAll();
    }

    @Override
    public SituationMatrimoiniale getById(Long id) {
        return situationMatrimonialeRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        situationMatrimonialeRepository.deleteById(id);
    }
}
