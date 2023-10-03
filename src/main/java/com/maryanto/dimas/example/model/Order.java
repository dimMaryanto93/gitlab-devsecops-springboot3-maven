package com.maryanto.dimas.example.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class Order {

    private String id;
    private String name;
    private String phoneNumber;
    private LocalDateTime transactionDate;
    private String notes;

}
