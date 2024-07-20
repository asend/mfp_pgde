package mfp.pgde.services;

import mfp.pgde.entities.Region;

import java.util.List;

public interface RegionService {
    Region create(Region region);
    Region update(Region region);
    void delete(Long region);
    List<Region> getAllRegions();
    Region getById(Long id);
}
