package mfp.pgde.repositories;

import io.swagger.v3.oas.annotations.tags.Tag;
import mfp.pgde.entities.Formation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(path = "formations")
@CrossOrigin
@Tag(name="formationsRest")
public interface FormationRepository extends JpaRepository<Formation, Long> {
}
