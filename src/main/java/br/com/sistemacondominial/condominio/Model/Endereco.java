package br.com.sistemacondominial.condominio.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Embeddable
@Data
public class Endereco implements Serializable {

    @Column(nullable = false,  length = 150)
    private String rua;

    @Column(nullable = false,  length = 150)
    private String bairro;

    @Column(nullable = false,  length = 9)
    private String cep;

     @Column(nullable = false,  length = 30)
    private String complemento;

}
