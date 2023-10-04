package com.maryanto.dimas.example.services;

import java.math.BigDecimal;

public class OrderService {

    public String getString() {
        return "new order";
    }

    public BigDecimal getPrice(Integer qty, BigDecimal price) throws Exception {
        if (qty <= 0) {
            throw new Exception("Quantity can't be less than 0");
        }

        if (price.compareTo(BigDecimal.ZERO) < -1) {
            throw new Exception("Price can't be less than 0");
        }

        return price.multiply(BigDecimal.valueOf(qty));
    }
}
