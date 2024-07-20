package mfp.pgde.services;

import mfp.pgde.entities.Demandeur;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DashboardServiceImpl implements DashboardService {
    @Autowired
    DemandeurService demandeurService;

    HashMap<String, Boolean> ta = new HashMap<String, Boolean>();
    List<Demandeur> demandeurDtos = new ArrayList<mfp.pgde.entities.Demandeur>();

    public void rest(){
        demandeurService.getAllDemandeurs().forEach(d->{
            ta.put("te", demandeurDtos.add(d));
            ta.get("te");
        });

    }
}
