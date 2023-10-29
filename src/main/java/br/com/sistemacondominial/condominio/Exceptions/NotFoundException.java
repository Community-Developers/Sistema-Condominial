package br.com.sistemacondominial.condominio.Exceptions;

public class NotFoundException extends RuntimeException{

    public NotFoundException(String message) {
        super(message);
    }
}
