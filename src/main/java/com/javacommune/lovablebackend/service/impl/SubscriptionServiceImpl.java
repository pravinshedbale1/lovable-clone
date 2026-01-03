package com.javacommune.lovablebackend.service.impl;

import com.javacommune.lovablebackend.dto.subscription.CheckoutRequest;
import com.javacommune.lovablebackend.dto.subscription.CheckoutResponse;
import com.javacommune.lovablebackend.dto.subscription.PaymentPortalReponse;
import com.javacommune.lovablebackend.dto.subscription.SubscriptionResponse;
import com.javacommune.lovablebackend.service.SubscriptionService;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {
    @Override
    public SubscriptionResponse getCurrentSubscription(Long userId) {
        return null;
    }

    @Override
    public CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId) {
        return null;
    }

    @Override
    public PaymentPortalReponse openCustomerPortal(Long userId) {
        return null;
    }
}
