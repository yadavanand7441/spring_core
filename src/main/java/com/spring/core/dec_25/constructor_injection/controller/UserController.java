package com.spring.core.dec_25.constructor_injection.controller;

import com.spring.core.dec_25.constructor_injection.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    public static void main(String[] args) {

        ApplicationContext userContext = new ClassPathXmlApplicationContext(
                "com/spring/core/dec_25/constructor_injection/config/cfg.xml");

        User user = userContext.getBean("user", User.class);
        //user.User();

        logger.info("User object: {}", user);
    }
}
