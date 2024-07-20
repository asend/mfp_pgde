package mfp.pgde.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Image extends AbstractEntity{
    private String nom;
    private String type;

    @ManyToOne
    @JoinColumn(name = "demandeur_id")
    @JsonIgnore
    private Demandeur demandeur;
}
