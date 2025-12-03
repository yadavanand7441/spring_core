package com.spring.core.dec_25.constructor_injection.controller;

import com.spring.core.dec_25.constructor_injection.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserController {
    public static void main(String[] args) {

        ApplicationContext userContext = new ClassPathXmlApplicationContext("com/spring/core/dec_25/constructor_injection/config/cfg.xml");
        User user = userContext.getBean("user", User.class);
        user.User();
        System.out.println(user);
    }
}
