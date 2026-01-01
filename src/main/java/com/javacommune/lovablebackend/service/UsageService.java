package com.javacommune.lovablebackend.service;

import com.javacommune.lovablebackend.dto.subscription.PlanLimitResponse;
import com.javacommune.lovablebackend.dto.subscription.UsageResponse;
import org.jspecify.annotations.Nullable;

public interface UsageService {
    UsageResponse getTodayUsage(Long usedId);

    PlanLimitResponse getCurrentSubscriptionLimit(Long usedId);
}
