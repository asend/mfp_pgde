package mfp.pgde.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import mfp.pgde.dto.DemandeurDto;
import mfp.pgde.entities.Demandeur;
import mfp.pgde.services.DemandeurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/demandeurs")
@CrossOrigin
@Tag(name="demandeur")
public class DemandeurController {
    @Autowired
    DemandeurService demandeurService;

    @PostMapping("")
    public Long demandeurCreate(@RequestBody DemandeurDto demandeur){
        return demandeurService.create(demandeur);
    }

    @GetMapping("")
    public List<Demandeur> demandeurGetAll(){
        return demandeurService.getAllDemandeurs();
    }

    @GetMapping("/all")
    public Page<DemandeurDto> getAll(@RequestParam int page, @RequestParam int size)  {
        return this.demandeurService.getAll(page, size);
    }

    @GetMapping("/{id}")
    public DemandeurDto demandeurGetById(@PathVariable("id") Long id){
        return demandeurService.getById(id);
    }

    @PutMapping("/demandeur-update")
    public DemandeurDto demadeurUpdate(@RequestBody DemandeurDto demandeur){
        return demandeurService.update(demandeur);
    }

    @DeleteMapping("/{id}")
    public void demandeurDelete(@PathVariable("id") Long id){
        demandeurService.delete(id);
    }

    @GetMapping("/by-user/{id}")
    public Demandeur findByUser(@PathVariable("id") Long id){
        return demandeurService.findDemandeurByUser(id);
    }

    @GetMapping("/demandeur-by-username/{username}")
    public DemandeurDto findByUsername(@PathVariable("username") String username){
        return demandeurService.findDemandeurByUsername(username);
    }
}
