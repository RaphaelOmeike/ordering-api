package com.codewithmosh.store.payments;

import com.codewithmosh.store.dtos.ErrorDto;
import com.codewithmosh.store.exceptions.CartEmptyException;
import com.codewithmosh.store.exceptions.CartNotFoundException;
import com.codewithmosh.store.repositories.OrderRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RequiredArgsConstructor
@RestController
@RequestMapping("/checkout")
public class CheckoutController {
    private final CheckoutService checkoutService;


    @PostMapping
    public ResponseEntity<?> checkout( 
            @Valid @RequestBody CheckoutRequest request
    ) {
        return ResponseEntity.ok(checkoutService.checkout(request));
    }
    @PostMapping("/webhook")
    public void handleWebhook(
//            @RequestHeader("Stripe-Signature") String signature,
            @RequestHeader Map<String,String> signature,
            @RequestBody String payload
    ) {
        checkoutService.handleWebhookEvent(new CheckoutRequest.WebhookRequest(signature, payload));
    }
    @ExceptionHandler({CartNotFoundException.class, CartEmptyException.class})
    public ResponseEntity<ErrorDto> handleException(Exception ex) {
        return ResponseEntity.badRequest().body(new ErrorDto(ex.getMessage()));
    }

    @ExceptionHandler(PaymentException.class)
    public ResponseEntity<ErrorDto> handlePaymentException(PaymentException ex) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(
                new ErrorDto("Error creating a checkout session"));
    }
}
