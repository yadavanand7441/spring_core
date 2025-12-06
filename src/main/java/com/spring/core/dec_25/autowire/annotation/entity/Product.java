package com.spring.core.dec_25.autowire.annotation.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter

public class Product {
    private int productId;
    private String productName;
    private double productPrice;
}
