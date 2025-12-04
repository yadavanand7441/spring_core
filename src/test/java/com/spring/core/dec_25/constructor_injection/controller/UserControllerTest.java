package com.spring.core.dec_25.constructor_injection.controller;

import com.spring.core.dec_25.basic.controller.StudentController;
import com.spring.core.dec_25.constructor_injection.entity.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class UserControllerTest {

    @Test
    void testUserBeanLoadingFromSpringContext() {

        ApplicationContext context = new ClassPathXmlApplicationContext(
                "com/spring/core/dec_25/constructor_injection/config/cfg.xml");

        // Fetching user bean
        User user = context.getBean("user", User.class);

        // Assertions to satisfy Sonar & valid JUnit test
        assertNotNull(user, "User bean must not be null");
        assertNotNull(user.getUserName(), "User name should not be null");
        assertNotNull(user.getUserAddress(), "User address should not be null");
    }

    @Test
    void testMainMethodRunsWithoutException() {
        String[] args = {};
        Assertions.assertDoesNotThrow(() -> UserController.main(args));
    }
}
