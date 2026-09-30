package com.example.parcial.controller;

import com.example.parcial.service.LabReservationService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LabReservationController {
    private final LabReservationService labReservationService;
    public LabReservationController(LabReservationService labReservationService) {
        this.labReservationService = labReservationService;
    }
}
