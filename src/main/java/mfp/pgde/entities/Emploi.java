package mfp.pgde.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Entity
public class Emploi extends AbstractEntity {

    private String libelle;
    @ManyToOne
    @JoinColumn(name = "secteur_id")
    @JsonIgnore
    private Secteur secteur;

}
