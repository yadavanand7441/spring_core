package com.spring.core.dec_25.constructor_injection.controller;

import com.spring.core.dec_25.constructor_injection.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class UserControllerTest {

    @Test
    void testUserBeanLoadedFromContext() {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "com/spring/core/dec_25/constructor_injection/config/cfg.xml");

        User user = context.getBean("user", User.class);

        assertNotNull(user, "user bean should not be null");

        // Call the custom method to cover it
        //user.User();

        // Example property checks (adjust according to cfg.xml values)
        assertNotNull(user.getUserName(), "userName should not be null");
        assertNotNull(user.getUserAddress(), "userAddress should not be null");

        // toString should contain userName
        String result = user.toString();
        assertTrue(result.contains(user.getUserName()));
    }
}
