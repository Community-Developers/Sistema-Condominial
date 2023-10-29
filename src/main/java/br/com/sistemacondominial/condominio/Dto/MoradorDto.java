package br.com.sistemacondominial.condominio.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MoradorDto implements Serializable {

    private String nome;

    private String sobrenome;

    private String cpf;

    private String celular;

    private String email;

    private ApartamentoDTO apartamento;

}
