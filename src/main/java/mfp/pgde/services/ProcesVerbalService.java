package mfp.pgde.services;

import mfp.pgde.entities.ProcesVerbal;

import java.util.List;

public interface ProcesVerbalService {
    ProcesVerbal create(ProcesVerbal procesVerbal);
    ProcesVerbal update(ProcesVerbal procesVerbal);
    List<ProcesVerbal> getAllProcesVerbal();
    ProcesVerbal getById(Long id);
    void delete(Long id);
}
