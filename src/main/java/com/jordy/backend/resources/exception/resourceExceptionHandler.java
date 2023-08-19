package com.jordy.backend.resources.exception;

import com.jordy.backend.services.exceptions.ObjectNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;

@ControllerAdvice
public class resourceExceptionHandler {

    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException e, HttpServletRequest req) {
        StandardError error = new StandardError(HttpStatus.NOT_FOUND.value(), e.getMessage(), new Timestamp(System.currentTimeMillis()).toString());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }
}
