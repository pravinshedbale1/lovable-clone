package com.javacommune.lovablebackend.service.impl;

import com.javacommune.lovablebackend.dto.auth.ProfileResponse;
import com.javacommune.lovablebackend.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public ProfileResponse getProfile(Long userId) {
        return null;
    }
}
