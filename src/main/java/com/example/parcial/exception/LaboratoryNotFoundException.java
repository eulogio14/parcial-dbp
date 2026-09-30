package com.example.parcial.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class LaboratoryNotFoundException extends RuntimeException {
    public LaboratoryNotFoundException(String message) {
        super(message);
    }
}
