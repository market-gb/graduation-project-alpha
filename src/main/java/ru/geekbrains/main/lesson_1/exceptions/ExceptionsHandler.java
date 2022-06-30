package ru.geekbrains.main.lesson_1.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionsHandler {
    private static final Logger log = LoggerFactory.getLogger(ExceptionHandler.class);

    @ExceptionHandler
    public ResponseEntity<?> handleNotFoundCatalogException (NotFoundCatalogException e) {
        log.error(e.getMessage());
        return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
    }



}
