package com.spring.core.dec_25.autowire.annotation.entity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserOnPropertyTest {

    @Test
    void testUserOnPropertySettersAndAutowiredField() {

        // Arrange
        UserOnProperty user = new UserOnProperty();
        Product product = new Product();

        // Act
        user.setUserId(101);
        user.setUserName("Anand");
        user.setProduct(product);

        // Assert
        assertEquals(101, user.getUserId());
        assertEquals("Anand", user.getUserName());
        assertNotNull(user.getProduct());
    }
}
