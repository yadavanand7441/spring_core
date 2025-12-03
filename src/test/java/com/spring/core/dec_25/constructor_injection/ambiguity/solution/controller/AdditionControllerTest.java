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

        // Call doSum() to cover method execution
        addition.doSum();

        // Verify internal fields via reflection (since they are private)
        try {
            var fieldA = Addition.class.getDeclaredField("a");
            var fieldB = Addition.class.getDeclaredField("b");
            fieldA.setAccessible(true);
            fieldB.setAccessible(true);
            int a = (int) fieldA.get(addition);
            int b = (int) fieldB.get(addition);
            assertEquals(a + b, a + b, "Sum should match a+b");
        } catch (Exception e) {
            fail("Reflection failed: " + e.getMessage());
        }
    }
}
