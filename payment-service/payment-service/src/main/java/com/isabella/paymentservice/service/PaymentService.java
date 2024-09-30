package com.isabella.paymentservice.service;

import com.isabella.paymentservice.model.Payment;

public interface PaymentService {

    void sendPayment(Payment payment);
}
