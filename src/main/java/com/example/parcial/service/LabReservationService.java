package com.example.parcial.service;

import com.example.parcial.repository.EquipmentSlotRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LabReservationService {
    private final EquipmentSlotRepository equipmentSlotRepository;

}
