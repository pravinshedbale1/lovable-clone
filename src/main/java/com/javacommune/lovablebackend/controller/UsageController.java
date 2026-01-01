package com.javacommune.lovablebackend.controller;

import com.javacommune.lovablebackend.dto.subscription.PlanLimitResponse;
import com.javacommune.lovablebackend.dto.subscription.UsageResponse;
import com.javacommune.lovablebackend.service.UsageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usage")
@RequiredArgsConstructor
public class UsageController {
    private final UsageService usageService;

    @GetMapping("/today")
    public ResponseEntity<UsageResponse> getTodayUsage() {
        Long usedId = 1L;
        return ResponseEntity.ok(usageService.getTodayUsage(usedId));
    }

    @GetMapping("/limits")
    public ResponseEntity<PlanLimitResponse> getPlanLimits() {
        Long usedId = 1L;
        return ResponseEntity.ok(usageService.getCurrentSubscriptionLimit(usedId));
    }

}
