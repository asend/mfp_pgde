package mfp.pgde.entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Handicap extends AbstractEntity {
    private String libelle;

}
