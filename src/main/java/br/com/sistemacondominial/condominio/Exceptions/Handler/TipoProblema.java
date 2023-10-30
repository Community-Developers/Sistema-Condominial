package br.com.sistemacondominial.condominio.Exceptions.Handler;

import lombok.Getter;

@Getter
public enum TipoProblema {

    ERRO_DE_SISTEMA("/erro-de-sistema", "Erro de sistema"),
    PARAMETRO_INVALIDO("/parametro-invalido", "Parâmetro inválido"),
    MENSAGEM_INCOMPREENSIVEL("/Mensagem-incompreensivel", "Mensagem incompreensivel"),
    ERRO_NEGOCIO("/erro-negocio", "Violação de regra de negócio"),
    RECURSO_NAO_ENCONTRADO("/entidade-nao-encontrada", "Entidade nao encontrada");

    private String title;
    private String uri;

    TipoProblema(String path, String title) {
        this.uri = "https://localhost:8080" + path;
        this.title = title;
    }


}
