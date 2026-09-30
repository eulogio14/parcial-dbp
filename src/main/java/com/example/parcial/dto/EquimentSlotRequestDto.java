package com.example.parcial.dto;

import jakarta.validation.constraints.NotBlank;

import java.time.ZonedDateTime;

public class EquimentSlotRequestDto {
    @NotBlank
    private String equipmentCode;
    @NotBlank
    private ZonedDateTime startTime;
    @NotBlank
    private ZonedDateTime endTime;
    @NotBlank
    private Integer capacity;
}
