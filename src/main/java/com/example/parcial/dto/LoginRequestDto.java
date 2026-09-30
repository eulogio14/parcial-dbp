package com.example.parcial.dto;

import jakarta.validation.constraints.NotBlank;

public class LoginRequestDto {
    @NotBlank
    private String username;
    @NotBlank
    private String password;
}
