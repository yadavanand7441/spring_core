package com.spring.core.dec_25.no_xml.controller;

import com.spring.core.dec_25.no_xml.config.Configurations;
import com.spring.core.dec_25.no_xml.config.UserConfig;
import com.spring.core.dec_25.no_xml.entity.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class NoXMLController {

    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Configurations.class);
        Product product = context.getBean("products", Product.class);
        logger.info("{}",product);
    }
}
