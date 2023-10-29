package br.com.sistemacondominial.condominio.Dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ApartamentoDTO {


    private String numApartamento;
    private String bloco;
    private Boolean ocupado = true;

}
