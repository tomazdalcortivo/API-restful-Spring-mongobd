package com.mongobdteste.workshopmongo.servicos.exception;

public class ObjetoNotFoundException extends RuntimeException{

    public ObjetoNotFoundException(String message) {
        super(message);
    }
}
