package com.maryanto.dimas.example.controller;

import com.maryanto.dimas.example.model.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.UUID;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    @PostMapping("/new")
    public ResponseEntity<Order> newOrder(@RequestBody Order order) {
//        save action
        order.setId(UUID.randomUUID().toString());
        order.setTransactionDate(LocalDateTime.now());
        return ResponseEntity.ok(order);
    }
}
