package mfp.pgde.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import mfp.pgde.entities.Departement;
import mfp.pgde.repositories.DepartementRepository;
import mfp.pgde.services.DepartementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departements")
@CrossOrigin
@Tag(name="departement")
public class DepartementController {

    @Autowired
    DepartementService departementService;

    @PostMapping("")
    public Departement departementCreate(@RequestBody Departement departement){
        return departementService.create(departement);
    }

    @GetMapping("")
    public List<Departement> departementGetAll(){
        return departementService.getAllDepartement();
    }

    @GetMapping("/{id}")
    public Departement departementGetById(@PathVariable("id") Long id){
        return departementService.getById(id);
    }

    @PutMapping("/departement-update")
    public Departement departementUpdate(@RequestBody Departement departement){
        return departementService.update(departement);
    }

    @DeleteMapping("/{id}")
    public void departementDelete(@PathVariable("id") Long id){
        departementService.delete(id);
    }


}
