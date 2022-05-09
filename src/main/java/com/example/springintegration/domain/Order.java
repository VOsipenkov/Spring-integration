package com.example.springintegration.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Order {
    private String name;
    private String cost;
    private LocalDateTime createdAt;
}
