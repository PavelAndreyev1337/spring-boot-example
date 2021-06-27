package com.example.springhomework.controller;

import com.example.springhomework.controller.dto.PaymentRequestDTO;
import com.example.springhomework.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    private final PaymentService paymentService;

    @Autowired
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/payments")
    public Object pay(@RequestBody PaymentRequestDTO paymentRequestDTO) {
        return paymentService.pay(paymentRequestDTO.getAccountId(), paymentRequestDTO.getAmount());
    }
}
