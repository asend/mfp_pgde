package mfp.pgde.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Secteur extends AbstractEntity {

    private String libelle;
    @OneToMany(mappedBy = "secteur")
    private List<Emploi> emplois;

}
