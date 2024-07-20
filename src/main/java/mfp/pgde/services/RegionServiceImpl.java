package mfp.pgde.services;

import mfp.pgde.entities.Region;
import mfp.pgde.repositories.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionServiceImpl implements RegionService {
    @Autowired
    RegionRepository regionRepository;

    @Override
    public Region create(Region region) {
        return regionRepository.save(region);
    }

    @Override
    public Region update(Region region) {
        return regionRepository.save(region);
    }

    @Override
    public void delete(Long id) {
        regionRepository.deleteById(id);
    }

    @Override
    public List<Region> getAllRegions() {
        return regionRepository.findAll();
    }

    @Override
    public Region getById(Long id) {
        return regionRepository.findById(id).orElse(null);
    }
}
