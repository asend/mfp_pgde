package mfp.pgde.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.List;

@Data
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Demandeur extends AbstractEntity {

    @Column(unique = true)
    private Long userId;

    @ManyToOne
    private SituationMatrimoiniale situation_matrimoiniale;

    @ManyToOne
    private Sexe sexe;

    @ManyToOne
    private Statut status;

    private String lieu_naissance;

    private String adresse;

    private String intitule_diplome;

    private String anne_diplome;

    private String autre_diplome;

    private String etablissement_diplome;

    private LocalDate date_naissance;

    private String specialite;

    private Integer nombre_enfant;

    private String telephone;

    private String code;

    private String username;

    @ManyToMany
    @JoinTable(
            name = "demandeur_handicap",
            joinColumns = @JoinColumn(name = "demandeur_id"),
            inverseJoinColumns = @JoinColumn(name = "handicap_id")
    )
    private List<Handicap> handicaps;

    @ManyToMany
    @JoinTable(
            name = "demandeur_secteur",
            joinColumns = @JoinColumn(name = "demandeur_id"),
            inverseJoinColumns = @JoinColumn(name = "secteur_id")
    )
    private List<Secteur> secteurs;

    @ManyToMany
    @JoinTable(
            name = "demandeur_emploi",
            joinColumns = @JoinColumn(name = "demandeur_id"),
            inverseJoinColumns = @JoinColumn(name = "emploi_id")
    )
    private List<Emploi> emplois;


    @ManyToOne
    private Region region_naissance_id;

    @ManyToOne
    private Departement departement_naissance_id;

    @ManyToOne
    private Region region_residense_id;

    @ManyToOne
    private Departement departement_residense_id;

    @ManyToOne
    private ProcesVerbal proces_verbal;

    @ManyToOne
    private Formation formation;

    @OneToMany(mappedBy = "demandeur")
    private List<Image> images;

}
