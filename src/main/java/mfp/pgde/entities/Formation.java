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
public class Formation extends AbstractEntity {

    private String libelle;

    @OneToMany(mappedBy = "formation")
    @JsonIgnore
    private List<Demandeur> demandeurs;

}
