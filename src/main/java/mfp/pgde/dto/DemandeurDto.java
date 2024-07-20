package mfp.pgde.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import mfp.pgde.entities.*;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DemandeurDto {
    private Long id;
    private Long user;
    private SituationMatrimoiniale situation_matrimoiniale;
    private Sexe sexe;
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
    private List<Handicap> handicaps;
    private List<SecteurDto> secteurs;
    private List<EmploiDto> emplois;
    private Region region_naissance_id;
    private Departement departement_naissance_id;
    private Region region_residense_id;
    private Departement departement_residense_id;
    private ProcesVerbal proces_verbal;
    private Formation formation;
    private List<Image> images;
}
