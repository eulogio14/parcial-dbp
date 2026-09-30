package com.example.parcial.controller;

import com.example.parcial.service.EquipmentSlotService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LaboratoryController {
    private final EquipmentSlotService equipmentSlotService;
    public LaboratoryController(EquipmentSlotService equipmentSlotService) {
        this.equipmentSlotService = equipmentSlotService;
    }
}
