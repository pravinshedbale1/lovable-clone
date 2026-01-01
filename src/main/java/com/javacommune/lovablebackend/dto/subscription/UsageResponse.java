package com.javacommune.lovablebackend.dto.subscription;

public record UsageResponse(Integer tokenUsed, Integer tokenLimit, Integer previewRunning, Integer previewLimit) {
}
