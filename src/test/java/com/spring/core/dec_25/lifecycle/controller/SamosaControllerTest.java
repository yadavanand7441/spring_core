package com.spring.core.dec_25.lifecycle.controller;

import com.spring.core.dec_25.lifecycle.entity.Samosa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class SamosaControllerTest {

    @Test
    void testSamosaBeanLoad() {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/core/dec_25/lifecycle/config/cfg.xml");

        // Bean load check
        assertTrue(context.containsBean("samosa"), "Samosa bean should exist");

        // Bean get
        Samosa samosa = context.getBean("samosa", Samosa.class);
        assertNotNull(samosa, "Samosa bean should not be null");

        // Example: check price is positive
        assertTrue(samosa.getPrice() >= 0, "Samosa price should be non-negative");

        // Optional: call init and destroy manually to test lifecycle
        assertDoesNotThrow(samosa::init, "init method should not throw exception");
        assertDoesNotThrow(samosa::destroy, "destroy method should not throw exception");

        // Close context
        context.close();
    }

    @Test
    void testMainMethodRunsWithoutException() {
        String[] args = {};
        Assertions.assertDoesNotThrow(() -> LifeCycleController.main(args));
    }
}
