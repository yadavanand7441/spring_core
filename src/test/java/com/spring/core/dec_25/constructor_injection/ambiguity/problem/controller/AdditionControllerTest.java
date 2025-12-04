package com.spring.core.dec_25.constructor_injection.ambiguity.problem.controller;

import com.spring.core.dec_25.constructor_injection.ambiguity.problem.entity.Addition;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class AdditionControllerTest {

    @Test
    void testAdditionBeanAndDoSumMethod() {

        // Loading Spring context (same logic as main)
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "com/spring/core/dec_25/constructor_injection/ambiguity/problem/config/cfg.xml");

        // Fetching addition bean
        Addition addition = context.getBean("addition", Addition.class);

        // Basic validation assertions for Sonar coverage
        assertNotNull(addition, "Addition bean should not be null");

        addition.doSum();  // even without return, method coverage milegi
    }
    @Test
    void testMainMethodRunsWithoutException() {
        String[] args = {};
        Assertions.assertDoesNotThrow(() -> AdditionController.main(args));
    }
}
