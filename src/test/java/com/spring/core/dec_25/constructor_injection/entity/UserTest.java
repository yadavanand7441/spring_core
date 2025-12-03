package com.spring.core.dec_25.constructor_injection.entity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void testNoArgsConstructorAndSetters() {
        User user = new User();
        user.setUserId(1);
        user.setUserName("Anand");
        user.setUserAddress("Kolkata");

        assertEquals(1, user.getUserId());
        assertEquals("Anand", user.getUserName());
        assertEquals("Kolkata", user.getUserAddress());
    }

    @Test
    void testAllArgsConstructor() {
        User user = new User(2, "Ram", "Delhi");

        assertEquals(2, user.getUserId());
        assertEquals("Ram", user.getUserName());
        assertEquals("Delhi", user.getUserAddress());
    }

    @Test
    void testToStringContainsFields() {
        User user = new User(3, "Shyam", "Mumbai");
        String result = user.toString();

        assertTrue(result.contains("3"));
        assertTrue(result.contains("Shyam"));
        assertTrue(result.contains("Mumbai"));
    }
}
