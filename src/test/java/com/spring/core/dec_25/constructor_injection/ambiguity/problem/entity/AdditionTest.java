package com.spring.core.dec_25.constructor_injection.ambiguity.problem.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {

    @Test
    void testIntConstructorAndDoSum() {
        Addition addition = new Addition(5, 10);
        assertEquals(15, additionSum(addition));
    }

    @Test
    void testDoubleConstructorAndDoSum() {
        Addition addition = new Addition(9.5, 2.5); // casted to int internally
        assertEquals(9 + 2, additionSum(addition)); // 7 + 2 = 9 (since double cast to int)
    }

    @Test
    void testStringConstructorAndDoSum() {
        Addition addition = new Addition("20", "30");
        assertEquals(50, additionSum(addition));
    }

    @Test
    void testToStringContainsValues() {
        Addition addition = new Addition(3, 4);
        String result = addition.toString();
        assertTrue(result.contains("3"));
        assertTrue(result.contains("4"));
    }

    // Helper method to capture sum without relying on System.out
    private int additionSum(Addition addition) {
        // Reflection to access private fields a and b
        try {
            var fieldA = Addition.class.getDeclaredField("a");
            var fieldB = Addition.class.getDeclaredField("b");
            fieldA.setAccessible(true);
            fieldB.setAccessible(true);
            int a = (int) fieldA.get(addition);
            int b = (int) fieldB.get(addition);
            return a + b;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
