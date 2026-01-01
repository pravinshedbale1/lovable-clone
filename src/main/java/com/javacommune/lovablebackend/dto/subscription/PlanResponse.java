package com.javacommune.lovablebackend.dto.subscription;

public record PlanResponse(Long id, String name, Integer maxProjects, Integer maxTokensPerDay, Boolean unlimitedAi, String price) {
}
