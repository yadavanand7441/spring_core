package com.spring.core.dec_25.no_xml.entity;

import com.spring.core.dec_25.no_xml.config.UserConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void testUserBeanLoadedWithInjectedAddress() {

        ApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);

        User user = context.getBean("user", User.class);

        assertNotNull(user);
        assertEquals(123, user.getUserId());
        assertEquals("Raju Kumar", user.getUserName());
        assertEquals(12, user.getUserAge());

        Address address = user.getAddress();
        assertNotNull(address, "Address should not be null");
    }
}
