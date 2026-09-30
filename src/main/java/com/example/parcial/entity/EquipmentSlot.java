package com.example.parcial.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.ZonedDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EquipmentSlot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long laboratoryId;

    private String equipmentCode;

    private ZonedDateTime startTime;

    private ZonedDateTime endTime;

    private Integer capacity;

    @Builder.Default
    private String STATUS = "AVAILABLE";
}

