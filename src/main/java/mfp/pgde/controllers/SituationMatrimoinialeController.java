package mfp.pgde.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import mfp.pgde.entities.SituationMatrimoiniale;
import mfp.pgde.services.SituationMatrimoinialeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/matrimoiniales")
@CrossOrigin
@Tag(name="matrimoiniale")
public class SituationMatrimoinialeController {
    @Autowired
    SituationMatrimoinialeService situationMatrimoinialeService;

    @PostMapping("")
    public SituationMatrimoiniale situationMatrimoinialeServiceCreate(@RequestBody SituationMatrimoiniale situationMatrimoiniale){
        return situationMatrimoinialeService.create(situationMatrimoiniale);
    }

    @GetMapping("")
    public List<SituationMatrimoiniale> situationMatrimoinialeServicesGetAll(){
        return situationMatrimoinialeService.getAllSituationMatrimoiniales();
    }

    @GetMapping("/{id}")
    public SituationMatrimoiniale situationMatrimoinialeServiceGetById(@PathVariable("id") Long id){
        return situationMatrimoinialeService.getById(id);
    }

    @PutMapping("/situation-update")
    public SituationMatrimoiniale situationMatrimoinialeServiceUpdate(@RequestBody SituationMatrimoiniale situationMatrimoiniale){
        return situationMatrimoinialeService.update(situationMatrimoiniale);
    }

    @DeleteMapping("/{id}")
    public void situationMatrimoinialeServiceDelete(@PathVariable("id") Long id){
        situationMatrimoinialeService.delete(id);
    }
}
