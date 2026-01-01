package com.javacommune.lovablebackend.service;

import com.javacommune.lovablebackend.dto.subscription.PlanResponse;

import java.util.List;

public interface PlanService {
    List<PlanResponse> getAllActivePlans();
}
