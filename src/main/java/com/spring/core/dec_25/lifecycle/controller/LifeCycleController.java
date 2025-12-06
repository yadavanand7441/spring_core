package com.spring.core.dec_25.lifecycle.controller;

import com.spring.core.dec_25.lifecycle.entity.Pepsi;
import com.spring.core.dec_25.lifecycle.entity.Samosa;
import com.spring.core.dec_25.lifecycle.entity.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleController {

    private static final Logger logger = LoggerFactory.getLogger(LifeCycleController.class);

    public static void main(String[] args) {

        AbstractApplicationContext samosaContext = new ClassPathXmlApplicationContext("com/spring/core/dec_25/lifecycle/config/cfg.xml");

        /**
         * below shutDown is xml-config
         * */
        samosaContext.registerShutdownHook();

        /**
         * example for spring-lifecycle using xml-config concept
         * */

        Samosa samosa = samosaContext.getBean("samosa", Samosa.class);
        logger.info("Samosa price is:{} ", samosa);

        /**
         * example for spring-lifecycle using interface concept
         * */
        Pepsi pepsi = samosaContext.getBean("pepsi", Pepsi.class);
        logger.info("Pepsi price is:{} ", pepsi);


        /**
         * example for spring-lifecycle using annotation(@PostConstruct, @PreDestroy) concept
         * */
        Subject subject = samosaContext.getBean("subject", Subject.class);
        logger.info("subject are:{}",subject);
    }
}
