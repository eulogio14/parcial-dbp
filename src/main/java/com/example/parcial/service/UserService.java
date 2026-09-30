package com.example.parcial.service;

import com.example.parcial.config.JwtService;
import com.example.parcial.dto.LoginRequestDto;
import com.example.parcial.dto.LoginResponseDto;
import com.example.parcial.dto.RegistarResponseDto;
import com.example.parcial.dto.RegistrarRequestDto;
import com.example.parcial.entity.User;
import com.example.parcial.exception.UserAlreadyExistsException;
import com.example.parcial.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;

    @Transactional
    public RegistarResponseDto register(RegistrarRequestDto dto) {
        if (userRepository.existsByUsername(dto.getUsername())){
            throw new UserAlreadyExistsException("eL USERNAME '" + dto.getUsername() + "' ya existe");
        }
        if(userRepository.existsByEmail(dto.getEmail()){
            throw new UserAlreadyExistsException("eL EMAIL '" + dto.getEmail() + "' ya existe");
        }

        User user = User.builder()
                .username(dto.getUsername())
                .email(dto.getEmail())
                .password(dto.getPassword())
                .role("ROLE_USER")
                .build();

        User userSaved = userRepository.save(user);

        RegistarResponseDto.builder()
                .id(userSaved.getId())
                .username(userSaved.getUsername())
                .email(userSaved.getEmail())
                .build();
    }

    public LoginResponseDto login(LoginRequestDto dto) {
        User user = userRepository.findByUsername(dto.getUsername())
                .orElseThrow(() -> new BadCredentialsException("Credenciales invalidas"));
        String token = jwtService.generateToken(user.getUsername(), user.getId());
        return LoginResponseDto.builder()
                .token(token)
                .expiresIn(3600L)
                .build();
    }
}
