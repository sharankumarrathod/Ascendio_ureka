package com.eurake.clinet.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/place")
    public String placeOrder() {

        String paymentResponse =
                restTemplate.getForObject(
                        "http://PAYMENT-SERVICE/payment/pay",
                        String.class);

        return "Order Placed → " + paymentResponse;
    }
}
