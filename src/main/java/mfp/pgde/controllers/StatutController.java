package mfp.pgde.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import mfp.pgde.entities.Statut;
import mfp.pgde.services.StatutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/statuts")
@CrossOrigin
@Tag(name="statut")
public class StatutController {
    @Autowired
    StatutService statutService;

    @PostMapping("")
    public Statut statutCreate(@RequestBody Statut statut){
        return statutService.create(statut);
    }

    @GetMapping("")
    public List<Statut> statutsGetAll(){
        return statutService.getAllStatus();
    }

    @GetMapping("/{id}")
    public Statut statutGetById(@PathVariable("id") Long id){
        return statutService.getById(id);
    }

    @PutMapping("/Statut-update")
    public Statut statutUpdate(@RequestBody Statut statut){
        return statutService.update(statut);
    }

    @DeleteMapping("/{id}")
    public void statutDelete(@PathVariable("id") Long id){
        statutService.delete(id);
    }
}
