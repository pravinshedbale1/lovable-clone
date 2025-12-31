package com.javacommune.lovablebackend.service;

import com.javacommune.lovablebackend.dto.auth.ProfileResponse;
import org.jspecify.annotations.Nullable;

public interface UserService {
    ProfileResponse getProfile(Long userId);
}
