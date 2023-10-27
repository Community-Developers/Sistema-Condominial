package br.com.sistemacondominial.condominio.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
public abstract class Pessoa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,  length = 150)
    private String nome;

    @Column(nullable = false,  length = 150)
    private String sobrenome;

    @Column(nullable = false,  length = 14)
    private String cpf;

    @Column(nullable = false,  length = 14)
    private String celular;

    @Column(nullable = false,  length = 150)
    private String email;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @CreationTimestamp
    @Column(name = "Data_Cadastro",nullable = false, columnDefinition = "datetime")
    private LocalDateTime dataCadastro;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @UpdateTimestamp
    @Column(name = "Data_Atualizacao", nullable = false, columnDefinition = "datetime")
    private LocalDateTime dataAtualizacao;
}