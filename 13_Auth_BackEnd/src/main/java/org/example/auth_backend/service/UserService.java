package org.example.auth_backend.service;

import lombok.RequiredArgsConstructor;
import org.example.auth_backend.dto.AuthDTO;
import org.example.auth_backend.dto.AuthResponseDTO;
import org.example.auth_backend.dto.RegisterDTO;
import org.example.auth_backend.entity.Role;
import org.example.auth_backend.entity.User;
import org.example.auth_backend.repository.UserRepository;
import org.example.auth_backend.util.JwtUtil;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtil jwtUtil;

    public String saveUser(RegisterDTO registerDTO){
        if (userRepository.findByUsername(registerDTO.getUsername()).isPresent()){
            throw new RuntimeException("Username is already in use");
        }
        User user=User.builder()
                .username(registerDTO.getUsername())
                .password(passwordEncoder.encode(registerDTO.getPassword()))
                .role(Role.valueOf(registerDTO.getRole()))
                .build();
        userRepository.save(user);
        return "User registered successfully";
    }
    public AuthResponseDTO authenticate(AuthDTO authDTO){
        User user=userRepository.findByUsername(authDTO.getUsername()).orElseThrow(
                () -> new UsernameNotFoundException("Username not found"));
        if (!passwordEncoder.matches(authDTO.getPassword(),user.getPassword())){
            throw new BadCredentialsException("Wrong password");
        }
        String token=jwtUtil.generateToken(authDTO.getUsername());
        return new AuthResponseDTO(token);
    }
}
