package com.javacommune.lovablebackend.dto.subscription;

public record PlanLimitResponse(String planName, Integer maxTokensPerDay, Integer maxProjects, Boolean unlimitedAi) {
}
