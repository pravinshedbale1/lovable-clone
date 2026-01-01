package com.javacommune.lovablebackend.service;

import com.javacommune.lovablebackend.dto.subscription.CheckoutRequest;
import com.javacommune.lovablebackend.dto.subscription.CheckoutResponse;
import com.javacommune.lovablebackend.dto.subscription.PaymentPortalReponse;
import com.javacommune.lovablebackend.dto.subscription.SubscriptionResponse;
import org.jspecify.annotations.Nullable;

public interface SubscriptionService {
    SubscriptionResponse getCurrentSubscription(Long userId);

    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId);

    PaymentPortalReponse openCustomerPortal(Long userId);
}
