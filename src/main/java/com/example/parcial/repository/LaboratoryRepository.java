package com.example.parcial.repository;

import com.example.parcial.entity.EquipmentSlot;
import com.example.parcial.entity.Laboratory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaboratoryRepository extends JpaRepository<Laboratory, Long> {
}
