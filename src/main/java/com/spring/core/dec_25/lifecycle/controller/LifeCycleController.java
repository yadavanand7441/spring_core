package com.spring.core.dec_25.lifecycle.controller;

import com.spring.core.dec_25.lifecycle.entity.Pepsi;
import com.spring.core.dec_25.lifecycle.entity.Samosa;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleController {

    private static final Logger logger = LoggerFactory.getLogger(Samosa.class);
    public static void main(String[] args) {

        AbstractApplicationContext samosaContext = new ClassPathXmlApplicationContext("com/spring/core/dec_25/lifecycle/config/cfg.xml");
        samosaContext.registerShutdownHook();
        Samosa samosa = samosaContext.getBean("samosa", Samosa.class);

        logger.info("Samosa price is:{} ",samosa);


        Pepsi pepsi = samosaContext.getBean("pepsi", Pepsi.class);
        logger.info("Pepsi price is:{} ",pepsi);
        samosaContext.registerShutdownHook();
    }
}
