package br.com.sistemacondominial.condominio.Exceptions;

public class Negocios extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public Negocios(String message) {
        super(message);
    }

    public Negocios(String message, Throwable cause) {
        super(message, cause);
    }
}
