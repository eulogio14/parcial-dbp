package com.example.parcial.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class ForbiddenLaboratoryActionException extends RuntimeException {
    public ForbiddenLaboratoryActionException(String message) {
        super(message);
    }
}
