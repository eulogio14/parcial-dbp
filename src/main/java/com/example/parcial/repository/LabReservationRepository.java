package com.example.parcial.repository;

import com.example.parcial.entity.EquipmentSlot;
import com.example.parcial.entity.LabReservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LabReservationRepository extends JpaRepository<LabReservation, Long> {
}
