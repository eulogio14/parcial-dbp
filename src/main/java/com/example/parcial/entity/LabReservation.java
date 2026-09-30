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
public class LabReservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long slotId;

    private Long studentId;

    private String purpose;

    private ZonedDateTime reservedAt;


    @Builder.Default
    private String status = "RESERVED";
}


