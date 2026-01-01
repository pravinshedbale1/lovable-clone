package com.javacommune.lovablebackend.dto.subscription;
import com.javacommune.lovablebackend.enums.SubscriptionStatus;

import java.time.Instant;

public record SubscriptionResponse(PlanResponse plan, SubscriptionStatus status, Instant periodEnd, Long tokensUsedThisCycle) {
}
