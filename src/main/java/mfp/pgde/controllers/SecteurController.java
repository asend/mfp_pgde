package mfp.pgde.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import mfp.pgde.dto.SecteurDto;
import mfp.pgde.entities.Secteur;
import mfp.pgde.services.SecteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/secteurs")
@CrossOrigin
@Tag(name="secteur")
public class SecteurController {
    @Autowired
    SecteurService secteurService;

    @PostMapping("")
    public Secteur secteurCreate(@RequestBody Secteur secteur){
        return secteurService.create(secteur);
    }

    @GetMapping("")
    public List<SecteurDto> secteursGetAll(){
        return secteurService.getAllSecteurs();
    }

    @GetMapping("/{id}")
    public SecteurDto secteurGetById(@PathVariable("id") Long id){
        return secteurService.getById(id);
    }

    @PutMapping("/secteur-update")
    public Secteur secteurUpdate(@RequestBody Secteur secteur){
        return secteurService.update(secteur);
    }

    @DeleteMapping("/{id}")
    public void secteurDelete(@PathVariable("id") Long id){
        secteurService.delete(id);
    }
}
