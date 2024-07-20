package mfp.pgde.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ProcesVerbal extends AbstractEntity {

    private String nom;

    private String annee;

    @OneToMany(mappedBy = "proces_verbal")
    @JsonIgnore
    private List<Demandeur> demandeurs;

    @ManyToOne
    private Statut statut;

}
