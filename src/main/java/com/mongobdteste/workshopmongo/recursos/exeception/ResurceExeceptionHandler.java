package com.mongobdteste.workshopmongo.recursos.exeception;

import com.mongobdteste.workshopmongo.servicos.exception.ObjetoNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ResurceExeceptionHandler {

    @ExceptionHandler(ObjetoNotFoundException.class)
    public ResponseEntity<StandardError> objectNotFound(ObjetoNotFoundException e, HttpServletRequest request){
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardError err = new StandardError(System.currentTimeMillis(),status.value(),"Não encontrado",e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }
}
