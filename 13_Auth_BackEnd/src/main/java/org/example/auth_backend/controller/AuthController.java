package org.example.auth_backend.controller;

import lombok.RequiredArgsConstructor;
import org.example.auth_backend.dto.ApiResponse;
import org.example.auth_backend.dto.AuthDTO;
import org.example.auth_backend.dto.RegisterDTO;
import org.example.auth_backend.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/auth")
@CrossOrigin
@RequiredArgsConstructor
public class AuthController {
    private final UserService  userService;
    @PostMapping("signup")
    public ResponseEntity<ApiResponse>saveUser(@RequestBody RegisterDTO registerDTO){
        return ResponseEntity.ok(new ApiResponse(
                200,"User registered successfully",userService.saveUser(registerDTO)));

    }
    @PostMapping("signin")
    public ResponseEntity<ApiResponse>loginUser(@RequestBody AuthDTO authDTO){
        return ResponseEntity.ok(new ApiResponse(
                200,"User registered successfully",userService.authenticate(authDTO)));

    }
}
