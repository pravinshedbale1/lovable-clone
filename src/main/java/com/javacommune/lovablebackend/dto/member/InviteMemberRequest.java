package com.javacommune.lovablebackend.dto.member;

import com.javacommune.lovablebackend.enums.ProjectRole;

public record InviteMemberRequest(String email, ProjectRole role) {
}
