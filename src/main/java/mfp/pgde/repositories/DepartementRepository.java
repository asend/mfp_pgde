package mfp.pgde.repositories;

import io.swagger.v3.oas.annotations.tags.Tag;
import mfp.pgde.entities.Departement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RepositoryRestResource(path = "departements")
@CrossOrigin
@Tag(name="departementsRest")
public interface DepartementRepository extends JpaRepository<Departement, Long> {

}
