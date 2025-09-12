package br.com.fiap3espa.exception;

public class CEPnotFoundException extends RuntimeException {
    public CEPnotFoundException(String message) {
        super(message);
    }
}
