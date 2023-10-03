package com.maryanto.dimas.example.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {
    private OrderService service = new OrderService();

    @Test
    public void testGetString() {
        assertEquals(this.service.getString(), "new order");
        assertNotEquals(this.service.getString(), "NEW ORDER");
    }
}