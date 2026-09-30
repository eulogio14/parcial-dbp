package com.example.parcial.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegistrarRequestDto {

    @NotBlank(message = "El username es obligatorio")
    private String username;
    @Email
    @NotBlank(message = "EL email es obligatorio")
    private String email;
    @NotBlank(message = "El password es obligatorio")
    @Size(min = 8, message = "EL password debe tener al menos 8 caracteres")

    private String password;
}
