package com.example.parcial.controller;

import com.example.parcial.service.EquipmentSlotService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EquipmentSlotController {
    private final EquipmentSlotService equipmentSlotService;
    public EquipmentSlotController(EquipmentSlotService equipmentSlotService) {
        this.equipmentSlotService = equipmentSlotService;
    }
}
