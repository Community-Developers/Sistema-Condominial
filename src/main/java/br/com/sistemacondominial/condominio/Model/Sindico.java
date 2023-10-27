package br.com.sistemacondominial.condominio.Model;

import jakarta.persistence.Embedded;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
public class Sindico extends Pessoa implements Serializable {

    @Embedded
    private Endereco endereco;


}
