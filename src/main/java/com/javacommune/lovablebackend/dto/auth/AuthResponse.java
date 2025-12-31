package com.javacommune.lovablebackend.dto.auth;

public record AuthResponse(String token, ProfileResponse profileResponse) {
}
