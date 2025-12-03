package com.spring.core.dec_25.constructor_injection.ambiguity.solution.entity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {

    @Test
    void testIntConstructorAndDoSum() {
        Addition addition = new Addition(5, 10);
        assertEquals(15, getSum(addition));
    }

    @Test
    void testDoubleConstructorAndDoSum() {
        Addition addition = new Addition(7.5, 2.5); // casted to int internally
        assertEquals(9, getSum(addition)); // 7 + 2 = 9
    }

    @Test
    void testStringConstructorAndDoSum() {
        Addition addition = new Addition("20", "30");
        assertEquals(50, getSum(addition));
    }

    @Test
    void testToStringContainsValues() {
        Addition addition = new Addition(3, 4);
        String result = addition.toString();
        assertTrue(result.contains("3"));
        assertTrue(result.contains("4"));
    }

    // Helper method to calculate sum using reflection (since fields are private)
    private int getSum(Addition addition) {
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
