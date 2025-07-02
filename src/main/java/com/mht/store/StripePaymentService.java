package com.mht.store;

public class StripePaymentService implements PaymentService {

    @Override
    public void processPayment(double amount) {
        // Logic to process payment using Stripe
        System.out.println("Processing payment with details: " + amount);
    }

}
