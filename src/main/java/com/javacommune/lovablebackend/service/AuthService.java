package com.javacommune.lovablebackend.service;

import com.javacommune.lovablebackend.dto.auth.AuthResponse;
import com.javacommune.lovablebackend.dto.auth.LoginRequest;
import com.javacommune.lovablebackend.dto.auth.SignupRequest;
import org.jspecify.annotations.Nullable;

public interface AuthService {
    AuthResponse signup(SignupRequest request);

    AuthResponse login(LoginRequest request);
}
