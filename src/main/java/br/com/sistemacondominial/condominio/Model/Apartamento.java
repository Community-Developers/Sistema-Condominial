package br.com.sistemacondominial.condominio.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class Apartamento implements Serializable {
    @Column(nullable = false, length = 5)
    private String numApartamento;
    @Column(nullable = false, length = 5)
    private String bloco;
    private Boolean ocupado = true;

}
