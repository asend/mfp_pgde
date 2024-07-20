package mfp.pgde.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Sexe extends AbstractEntity {
    private String libelle;
    @OneToMany(mappedBy = "sexe")
    @JsonIgnore
    private List<Demandeur> demandeurs;
}
