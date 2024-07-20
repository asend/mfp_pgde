package mfp.pgde.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Region extends AbstractEntity {

    private String nom;

    @OneToMany(mappedBy = "region")
    private List<Departement> departements;

    @OneToMany(mappedBy = "region_naissance_id")
    @JsonIgnore
    private List<Demandeur> demandeurs;

}
