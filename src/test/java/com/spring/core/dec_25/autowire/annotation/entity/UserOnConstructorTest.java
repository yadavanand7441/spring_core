package com.spring.core.dec_25.autowire.annotation.entity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserOnConstructorTest {

    @Test
    void testConstructorInjection() {

        Product product = new Product();
        UserOnConstructor user = new UserOnConstructor(10, "Anand", product);

        assertEquals(10, user.getUId());
        assertEquals("Anand", user.getUName());
        assertNotNull(user.getProduct());
        assertEquals(product, user.getProduct());
    }
}
