package com.example.task4;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class Q6_GlobalExceptionHandler {

    // 6. Handle exceptions using @ExceptionHandler.

    @ExceptionHandler(Q5_DataNotFoundException.class)
    public ResponseEntity<String> handleNotFound(Q5_DataNotFoundException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    // 10. Handle database errors using simple exception handling. (Generic
    // fallback)
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleGlobalException(Exception ex) {
        return new ResponseEntity<>("An error occurred: " + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
