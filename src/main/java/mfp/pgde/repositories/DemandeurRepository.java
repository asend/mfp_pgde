package mfp.pgde.repositories;

import io.swagger.v3.oas.annotations.tags.Tag;
import mfp.pgde.entities.Demandeur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Optional;

@RepositoryRestResource(path = "demandeurs")
@CrossOrigin
@Tag(name="demandeursRest")
public interface DemandeurRepository extends JpaRepository<Demandeur, Long> {
    Optional<Demandeur> findDemandeurByUserId(Long id);
    Optional<Demandeur> findDemandeurByUsername(String username);
}
