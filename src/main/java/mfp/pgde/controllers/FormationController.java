package mfp.pgde.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import mfp.pgde.entities.Formation;
import mfp.pgde.services.FormationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/formations")
@CrossOrigin
@Tag(name="formation")
public class FormationController {
    @Autowired
    FormationService formationService;

    @PostMapping("")
    public Formation formationCreate(@RequestBody Formation formation){
        return formationService.create(formation);
    }

    @GetMapping("")
    public List<Formation> formationGetAll(){
        return formationService.getAllFormation();
    }

    @GetMapping("/{id}")
    public Formation formationGetById(@PathVariable("id") Long id){
        return formationService.getById(id);
    }

    @PutMapping("/formation-update")
    public Formation formationUpdate(@RequestBody Formation formation){
        return formationService.update(formation);
    }

    @DeleteMapping("/{id}")
    public void formationDelete(@PathVariable("id") Long id){
        formationService.delete(id);
    }
}
