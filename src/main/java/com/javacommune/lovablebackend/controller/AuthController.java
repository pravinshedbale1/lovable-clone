package com.javacommune.lovablebackend.controller;

import com.javacommune.lovablebackend.dto.auth.AuthResponse;
import com.javacommune.lovablebackend.dto.auth.LoginRequest;
import com.javacommune.lovablebackend.dto.auth.ProfileResponse;
import com.javacommune.lovablebackend.dto.auth.SignupRequest;
import com.javacommune.lovablebackend.service.AuthService;
import com.javacommune.lovablebackend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {
    private final AuthService authService;
    private final UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<AuthResponse> signup(@RequestBody SignupRequest request) {
        return ResponseEntity.ok(authService.signup(request));
    }

    @PostMapping("/login")
    public  ResponseEntity<AuthResponse> login(@RequestBody LoginRequest request) {
        return ResponseEntity.ok(authService.login(request));
    }

    @GetMapping("/me")
    public ResponseEntity<ProfileResponse> getProfile() {
        Long userId = 1L;
        return ResponseEntity.ok(userService.getProfile(userId));
    }
}
