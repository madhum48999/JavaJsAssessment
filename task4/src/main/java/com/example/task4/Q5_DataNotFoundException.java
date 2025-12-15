package com.example.task4;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// 5. Create a custom exception for data not found.
@ResponseStatus(HttpStatus.NOT_FOUND)
public class Q5_DataNotFoundException extends RuntimeException {
    public Q5_DataNotFoundException(String message) {
        super(message);
    }
}
