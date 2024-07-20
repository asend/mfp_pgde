package mfp.pgde.services;

import mfp.pgde.entities.Handicap;
import mfp.pgde.repositories.HandicapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HandicapServiceImpl implements HandicapService{
    @Autowired
    HandicapRepository handicapRepository;
    @Override
    public Handicap create(Handicap handicap) {
        return handicapRepository.save(handicap);
    }

    @Override
    public Handicap update(Handicap handicap) {
        return handicapRepository.save(handicap);
    }

    @Override
    public List<Handicap> getAllhandicaps() {
        return handicapRepository.findAll();
    }

    @Override
    public Handicap getById(Long id) {
        return handicapRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        handicapRepository.deleteById(id);
    }
}
