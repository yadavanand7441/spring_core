package com.spring.core.dec_25.constructor_injection.ambiguity.solution.controller;

import com.spring.core.dec_25.constructor_injection.ambiguity.solution.entity.Addition;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class AdditionControllerTest {

    @Test
    void testAdditionBeanLoadedFromContext() {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "com/spring/core/dec_25/constructor_injection/ambiguity/solution/config/cfg.xml");

        Addition addition = context.getBean("addition1", Addition.class);

        assertNotNull(addition, "addition1 bean should not be null");

        // Execute doSum() method to calculate sum
        addition.doSum();

        // Verify internal fields via reflection
        try {
            var fieldA = Addition.class.getDeclaredField("a");
            var fieldB = Addition.class.getDeclaredField("b");
            var fieldSum = Addition.class.getDeclaredField("sum");

            fieldA.setAccessible(true);
            fieldB.setAccessible(true);
            fieldSum.setAccessible(true);

            int a = (int) fieldA.get(addition);
            int b = (int) fieldB.get(addition);
            int actualSum = (int) fieldSum.get(addition);

            int expectedSum = a + b;

            assertEquals(expectedSum, actualSum, "Sum should match a + b");

        } catch (Exception e) {
            fail("Reflection failed: " + e.getMessage());
        }
    }
}
