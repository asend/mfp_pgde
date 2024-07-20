package mfp.pgde.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmploiDto {
    private Long id;
    private SecteurDto secteur;
    private Long idSecteur;
    @NotNull(message = "Le libelle ne doit pas etre null")
    @NotBlank(message = "Le libelle ne doit pas etre vide")
    @NotEmpty(message = "Le libelle ne doit pas etre vide")
    private String libelle;
    private String libelleSecteur;
}
