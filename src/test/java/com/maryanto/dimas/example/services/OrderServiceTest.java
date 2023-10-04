package com.maryanto.dimas.example.services;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {
    private OrderService service = new OrderService();

    @Test
    public void testGetString() {
        assertEquals(this.service.getString(), "new order");
        assertNotEquals(this.service.getString(), "NEW ORDER");
    }

    @Test
    public void testOrderItem() throws Exception {
        assertEquals(this.service.getPrice(2, new BigDecimal(10000)), new BigDecimal(20000));

        assertThrowsExactly(
                Exception.class,
                () -> {
                    this.service.getPrice(0, new BigDecimal(1000));
                },
                "Quantity can't be less than 0");
    }
}