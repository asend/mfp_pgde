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
public class Departement extends AbstractEntity {
    
    private String nom;

    @ManyToOne
    @JsonIgnore
    private Region region;

    @OneToMany(mappedBy = "departement_naissance_id")
    @JsonIgnore
    private List<Demandeur> demandeurs;

}
