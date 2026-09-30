package com.example.parcial.service;

import com.example.parcial.config.JwtService;
import com.example.parcial.dto.LoginRequestDto;
import com.example.parcial.dto.LoginResponseDto;
import com.example.parcial.dto.RegistarResponseDto;
import com.example.parcial.dto.RegistrarRequestDto;
import com.example.parcial.entity.User;
import com.example.parcial.exception.UserAlreadyExistsException;
import com.example.parcial.repository.EquipmentSlotRepository;
import com.example.parcial.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EquipmentSlotService {
    private final EquipmentSlotRepository equipmentSlotRepository;

}
