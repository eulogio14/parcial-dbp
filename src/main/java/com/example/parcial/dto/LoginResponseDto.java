package com.example.parcial.dto;

import lombok.Builder;

@Builder
public class LoginResponseDto {
    private String token;
    private Long expiresIn;
}
