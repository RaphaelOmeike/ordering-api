package com.codewithmosh.store.payments;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.util.Map;
import java.util.UUID;

@Data
public class CheckoutRequest {
    @NotNull(message = "Cart ID is required")
    private UUID cartId;

    @AllArgsConstructor
    @Getter
    public static class WebhookRequest {
        private Map<String, String> headers;
        private String payload;
    }
}
