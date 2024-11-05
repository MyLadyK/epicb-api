package com.epicbattle.epicb_api.exception;

import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

public class GlobalExceptionHandler {

    // Manejar excepciones de tipo ConfigDataResourceNotFoundException
    @ExceptionHandler(ConfigDataResourceNotFoundException.class)
    public ResponseEntity<String> handleNotFoundException(ConfigDataResourceNotFoundException ex, WebRequest request) {
        return new ResponseEntity<>("Personaje no encontrado: " + ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    // Manejar otras excepciones (ejemplo)
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleGlobalException(Exception ex, WebRequest request) {
        return new ResponseEntity<>("Error inesperado.", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    // Manejar la excepción de personaje en getCharacterById
    public static class ResourceNotFoundException extends RuntimeException {
        public ResourceNotFoundException(String message) {
            super(message);
        }
    }
}
