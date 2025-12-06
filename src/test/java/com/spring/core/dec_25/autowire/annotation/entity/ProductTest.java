package com.spring.core.dec_25.autowire.annotation.entity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void testProductSettersAndToString() {
        Product product = new Product();
        product.setProductId(123);
        product.setProductName("Laptop");
        product.setProductPrice(55000.50);

        assertEquals(123, product.getProductId());
        assertEquals("Laptop", product.getProductName());
        assertEquals(55000.50, product.getProductPrice());

        String expected = "Product(productId=123, productName=Laptop, productPrice=55000.5)";
        assertEquals(expected, product.toString());
    }
}
