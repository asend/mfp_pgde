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
public class Statut extends AbstractEntity {
    private String libelle;
    private String tag;
    @OneToMany(mappedBy = "statut")
    @JsonIgnore
    private List<ProcesVerbal> procesVerbals;

    @OneToMany(mappedBy = "status")
    @JsonIgnore
    private List<Demandeur> demandeurs;
}
