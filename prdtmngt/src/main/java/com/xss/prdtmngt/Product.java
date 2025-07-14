package com.xss.prdtmngt;

public record Product(
        String productId, String name, String description,
        Double price, int quantity, String userId) {
}