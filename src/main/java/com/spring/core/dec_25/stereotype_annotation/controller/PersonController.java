package com.spring.core.dec_25.stereotype_annotation.controller;

import com.spring.core.dec_25.stereotype_annotation.entity.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonController {

    private static Logger logger = LoggerFactory.getLogger(PersonController.class);

    public static void main(String[] args) {

        ApplicationContext personContext = new ClassPathXmlApplicationContext("com/spring/core/dec_25/stereotype_annotation/config/cfg.xml");
        /**
         * Person person = personContext.getBean("person", Person.class);
         * */

        Person person = personContext.getBean("p1", Person.class);
        logger.info("person data using stereotype annotation{}",person);
    }
}
