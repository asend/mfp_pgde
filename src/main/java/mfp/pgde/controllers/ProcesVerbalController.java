package mfp.pgde.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import mfp.pgde.entities.ProcesVerbal;
import mfp.pgde.services.ProcesVerbalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/procesverbals")
@CrossOrigin
@Tag(name="procesverbal")
public class ProcesVerbalController {
    @Autowired
    ProcesVerbalService procesVerbalService;

    @PostMapping("")
    public ProcesVerbal procesVerbalCreate(@RequestBody ProcesVerbal procesVerbal){
        return procesVerbalService.create(procesVerbal);
    }

    @GetMapping("")
    public List<ProcesVerbal> procesVerbalGetAll(){
        return procesVerbalService.getAllProcesVerbal();
    }

    @GetMapping("/{id}")
    public ProcesVerbal procesVerbalGetById(@PathVariable("id") Long id){
        return procesVerbalService.getById(id);
    }

    @PutMapping("/proces-verbal-update")
    public ProcesVerbal procesVerbalUpdate(@RequestBody ProcesVerbal procesVerbal){
        return procesVerbalService.update(procesVerbal);
    }

    @DeleteMapping("/{id}")
    public void procesVerbalDelete(@PathVariable("id") Long id){
        procesVerbalService.delete(id);
    }
}
