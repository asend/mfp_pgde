package mfp.pgde.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import mfp.pgde.entities.Region;
import mfp.pgde.services.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/regions")
@CrossOrigin
@Tag(name="region")
public class RegionController {
    @Autowired
    RegionService regionService;

    @PostMapping("")
    public Region regionCreate(@RequestBody Region region){
        return regionService.create(region);
    }

    @GetMapping("")
    public List<Region> regionGetAll(){
        return regionService.getAllRegions();
    }

    @GetMapping("/{id}")
    public Region regionGetById(@PathVariable("id") Long id){
        return regionService.getById(id);
    }

    @PutMapping("/region-update")
    public Region regionUpdate(@RequestBody Region region){
        return regionService.update(region);
    }

    @DeleteMapping("/{id}")
    public void regionDelete(@PathVariable("id") Long id){
        regionService.delete(id);
    }
}
