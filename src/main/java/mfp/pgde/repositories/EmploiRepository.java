package mfp.pgde.repositories;

import mfp.pgde.entities.Emploi;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmploiRepository extends JpaRepository<Emploi, Long> {


}
