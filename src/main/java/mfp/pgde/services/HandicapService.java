package mfp.pgde.services;

import mfp.pgde.entities.Handicap;

import java.util.List;

public interface HandicapService {
    Handicap create(Handicap handicap);
    Handicap update(Handicap handicap);
    List<Handicap> getAllhandicaps();
    Handicap getById(Long id);
    void delete(Long id);
}
