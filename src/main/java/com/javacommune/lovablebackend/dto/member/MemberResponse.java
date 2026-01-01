package com.javacommune.lovablebackend.dto.member;

import com.javacommune.lovablebackend.enums.ProjectRole;

import java.time.Instant;

public record MemberResponse(Long userId, String email, String name, String avatarUrl, ProjectRole role, Instant invitedAt) {
}
