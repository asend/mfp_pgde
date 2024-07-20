package mfp.pgde.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import mfp.pgde.dto.EmploiDto;
import mfp.pgde.entities.Emploi;
import mfp.pgde.services.EmploiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emplois")
@CrossOrigin
@Tag(name="emploi")
public class EmploiController {
    @Autowired
    EmploiService emploiService;

    @PostMapping("")
    public EmploiDto emploiCreate(@RequestBody EmploiDto emploi){
        return emploiService.create(emploi);
    }

    @GetMapping("")
    public List<EmploiDto> emploiGetAll(){
        return emploiService.getAllEmplois();
    }

    @GetMapping("/{id}")
    public EmploiDto emploiGetById(@PathVariable("id") Long id){
        return emploiService.getById(id);
    }

    @PutMapping("/emploi-update")
    public EmploiDto emploiUpdate(@RequestBody EmploiDto emploi){
        return emploiService.update(emploi);
    }

    @DeleteMapping("/{id}")
    public void emploiDelete(@PathVariable("id") Long id){
        emploiService.delete(id);
    }

}
