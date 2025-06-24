package com.codewithmosh.store.services;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CheckoutSession {
    private String checkoutUrl;
}
