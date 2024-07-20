package mfp.pgde.repositories;

import io.swagger.v3.oas.annotations.tags.Tag;
import mfp.pgde.entities.Sexe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(path = "sexes")
@CrossOrigin
@Tag(name="sexesRest")
public interface SexeRepository extends JpaRepository<Sexe, Long> {
}
