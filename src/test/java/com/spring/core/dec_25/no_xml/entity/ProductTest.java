package com.spring.core.dec_25.no_xml.entity;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void testProductSettersAndGetters() {
        Product product = new Product();

        product.setId(101);
        product.setName("Laptop");
        List<Double> prices = Arrays.asList(55000.0, 60000.0, 65000.0);
        product.setPrice(prices);

        assertEquals(101, product.getId());
        assertEquals("Laptop", product.getName());
        assertEquals(prices, product.getPrice());
    }

    @Test
    void testToStringMethod() {
        Product product = new Product();
        product.setId(101);
        product.setName("Laptop");
        product.setPrice(Arrays.asList(55000.0, 60000.0, 65000.0));

        String expected = "Product(id=101, name=Laptop, price=[55000.0, 60000.0, 65000.0])";
        assertEquals(expected, product.toString());
    }

    @Test
    void testProductDefaultValues() {
        Product product = new Product();

        assertEquals(0, product.getId());
        assertNull(product.getName());
        assertNull(product.getPrice());
    }
}
