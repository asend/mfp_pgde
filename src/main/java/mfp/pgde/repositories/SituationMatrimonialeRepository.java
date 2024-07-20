package mfp.pgde.repositories;

import io.swagger.v3.oas.annotations.tags.Tag;
import mfp.pgde.entities.SituationMatrimoiniale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(path = "matrimoiniales")
@CrossOrigin
@Tag(name="matrimoinialesRest")
public interface SituationMatrimonialeRepository extends JpaRepository<SituationMatrimoiniale, Long> {
}
