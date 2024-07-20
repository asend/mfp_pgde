package mfp.pgde.repositories;


import io.swagger.v3.oas.annotations.tags.Tag;
import mfp.pgde.entities.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(path = "images")
@CrossOrigin
@Tag(name="imagesRest")
public interface ImageRepository extends JpaRepository<Image, Long> {
}
