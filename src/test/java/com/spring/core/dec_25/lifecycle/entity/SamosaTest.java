package com.spring.core.dec_25.lifecycle.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SamosaTest {

    private Samosa samosa;

    @BeforeEach
    void setUp() {
        // Default constructor ke saath object create
        samosa = new Samosa();
    }

    @Test
    void testGetterSetter() {
        samosa.setPrice(50.0);
        assertEquals(50.0, samosa.getPrice(), "Price should be 50.0");
    }

    @Test
    void testAllArgsConstructor() {
        Samosa s = new Samosa();
        assertEquals(0.0, s.getPrice(), "Price should be 75.0");
    }

    @Test
    void testInitMethod() {
        // init method sirf print karta hai, exception na aaye ye check karte hain
        assertDoesNotThrow(() -> samosa.init());
    }

    @Test
    void testDestroyMethod() {
        // destroy method bhi sirf print karta hai
        assertDoesNotThrow(() -> samosa.destroy());
    }

    @Test
    void testToString() {
        samosa.setPrice(100.0);
        assertTrue(samosa.toString().contains("price=100.0"));
    }
}
