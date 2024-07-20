package mfp.pgde.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import mfp.pgde.entities.Handicap;
import mfp.pgde.services.HandicapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/handicaps")
@CrossOrigin
@Tag(name="handicap")
public class HandicapController {
    @Autowired
    HandicapService handicapService;

    @PostMapping("")
    public Handicap handicapCreate(@RequestBody Handicap handicap){
        return handicapService.create(handicap);
    }

    @GetMapping("")
    public List<Handicap> handicapsGetAll(){
        return handicapService.getAllhandicaps();
    }

    @GetMapping("/{id}")
    public Handicap handicapGetById(@PathVariable("id") Long id){
        return handicapService.getById(id);
    }

    @PutMapping("/handicap-update")
    public Handicap handicapUpdate(@RequestBody Handicap handicap){
        return handicapService.update(handicap);
    }

    @DeleteMapping("/{id}")
    public void formationDelete(@PathVariable("id") Long id){
        handicapService.delete(id);
    }
}
