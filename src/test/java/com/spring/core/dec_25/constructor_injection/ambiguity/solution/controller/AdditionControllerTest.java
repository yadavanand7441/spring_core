package com.spring.core.dec_25.constructor_injection.ambiguity.solution.controller;

import com.spring.core.dec_25.constructor_injection.ambiguity.solution.entity.Addition;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class AdditionControllerTest {

    @Test
    void testAdditionBeanAndDoSumMethod() {

        // Load Spring context same as in main()
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "com/spring/core/dec_25/constructor_injection/ambiguity/solution/config/cfg.xml");

        // Fetch bean with id "addition1"
        Addition addition = context.getBean("addition1", Addition.class);

        // Assertions for null check and dependency correct loading
        assertNotNull(addition, "Addition bean should not be null");

        // Uncomment if Addition contains fields like int a, int b (add matching expected values)
        // assertEquals(10, addition.getA());
        // assertEquals(20, addition.getB());

        // Call method to increase method coverage
        addition.doSum();
    }
}
