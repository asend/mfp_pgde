package mfp.pgde.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import mfp.pgde.entities.Secteur;
import mfp.pgde.entities.Sexe;
import mfp.pgde.services.SecteurService;
import mfp.pgde.services.SexeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sexes")
@CrossOrigin
@Tag(name="sexe")
public class SexeController {
    @Autowired
    SexeService sexeService;

    @PostMapping("")
    public Sexe sexeCreate(@RequestBody Sexe sexe){
        return sexeService.create(sexe);
    }

    @GetMapping("")
    public List<Sexe> sexesGetAll(){
        return sexeService.getAllSexes();
    }

    @GetMapping("/{id}")
    public Sexe sexeGetById(@PathVariable("id") Long id){
        return sexeService.getById(id);
    }

    @PutMapping("/sexe-update")
    public Sexe sexeUpdate(@RequestBody Sexe sexe){
        return sexeService.update(sexe);
    }

    @DeleteMapping("/{id}")
    public void sexeDelete(@PathVariable("id") Long id){
        sexeService.delete(id);
    }
}
