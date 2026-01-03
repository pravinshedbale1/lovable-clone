package com.javacommune.lovablebackend.service.impl;

import com.javacommune.lovablebackend.dto.subscription.PlanLimitResponse;
import com.javacommune.lovablebackend.dto.subscription.UsageResponse;
import com.javacommune.lovablebackend.service.UsageService;
import org.springframework.stereotype.Service;

@Service
public class UsageServiceImpl implements UsageService {
    @Override
    public UsageResponse getTodayUsage(Long usedId) {
        return null;
    }

    @Override
    public PlanLimitResponse getCurrentSubscriptionLimit(Long usedId) {
        return null;
    }
}
