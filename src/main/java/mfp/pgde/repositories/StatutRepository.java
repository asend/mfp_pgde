package mfp.pgde.repositories;

import io.swagger.v3.oas.annotations.tags.Tag;
import mfp.pgde.entities.Statut;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(path = "statuts")
@CrossOrigin
@Tag(name="statutsRest")
public interface StatutRepository extends JpaRepository<Statut, Long> {
}