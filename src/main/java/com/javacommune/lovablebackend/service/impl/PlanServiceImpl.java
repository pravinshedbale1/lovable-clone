package com.javacommune.lovablebackend.service.impl;

import com.javacommune.lovablebackend.dto.subscription.PlanResponse;
import com.javacommune.lovablebackend.service.PlanService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanServiceImpl implements PlanService {
    @Override
    public List<PlanResponse> getAllActivePlans() {
        return List.of();
    }
}
