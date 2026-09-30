package com.example.parcial.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EquipmentSlotNotFounException extends RuntimeException {
    public EquipmentSlotNotFounException(String message) {
        super(message);
    }
}
