package com.example.parcial.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;

import java.time.ZonedDateTime;
@Builder
public class EquimentSlotResponseDto {
    private Long id;
    private String equipmentCode;
    private String status;
}
