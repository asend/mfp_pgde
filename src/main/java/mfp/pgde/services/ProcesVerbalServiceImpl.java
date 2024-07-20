package mfp.pgde.services;

import mfp.pgde.entities.ProcesVerbal;
import mfp.pgde.repositories.ProcesVerbalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProcesVerbalServiceImpl implements ProcesVerbalService {
    @Autowired
    ProcesVerbalRepository procesVerbalRepository;

    @Override
    public ProcesVerbal create(ProcesVerbal procesVerbal) {
        return procesVerbalRepository.save(procesVerbal);
    }

    @Override
    public ProcesVerbal update(ProcesVerbal procesVerbal) {
        return procesVerbalRepository.save(procesVerbal);
    }

    @Override
    public List<ProcesVerbal> getAllProcesVerbal() {
        return procesVerbalRepository.findAll();
    }

    @Override
    public ProcesVerbal getById(Long id) {
        return procesVerbalRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        procesVerbalRepository.deleteById(id);
    }
}
