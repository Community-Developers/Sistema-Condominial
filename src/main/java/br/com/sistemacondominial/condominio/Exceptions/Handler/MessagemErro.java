package br.com.sistemacondominial.condominio.Exceptions.Handler;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Builder
@Data
public class MessagemErro {

    private Integer status;
    private String tipo;
    private String titulo;
    private String detalhe;
    private LocalDateTime timestamp;

}
