package com.spring.core.dec_25.autowire.annotation.entity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserOnSetterMethodTest {

    @Test
    void testSetterMethods() {
        UserOnSetterMethod user = new UserOnSetterMethod();
        Product product = new Product();

        user.setId(101);
        user.setName("Anand");
        user.setProduct(product);

        assertEquals(101, user.toString().contains("101") ? 101 : 0);
        assertTrue(user.toString().contains("Anand"));
        assertTrue(user.toString().contains("product"));
    }
}
