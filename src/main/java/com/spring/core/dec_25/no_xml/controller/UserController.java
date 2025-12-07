package com.spring.core.dec_25.no_xml.controller;

import com.spring.core.dec_25.no_xml.config.UserConfig;
import com.spring.core.dec_25.no_xml.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserController {

    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);
        User user = context.getBean("user", User.class);
        logger.info("{}",user);
    }
}
