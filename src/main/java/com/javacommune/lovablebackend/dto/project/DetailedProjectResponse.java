package com.javacommune.lovablebackend.dto.project;

import com.javacommune.lovablebackend.dto.auth.ProfileResponse;

import java.time.Instant;

public record DetailedProjectResponse(Long id, String name, Instant createdAt, Instant updatedAt, ProfileResponse owner ) {
}
