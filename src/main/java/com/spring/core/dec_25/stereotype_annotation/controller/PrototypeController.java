package com.spring.core.dec_25.stereotype_annotation.controller;

import com.spring.core.dec_25.stereotype_annotation.entity.TeacherPrototype;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrototypeController {

    private static Logger logger = LoggerFactory.getLogger(PrototypeController.class);

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/core/dec_25/stereotype_annotation/config/cfg.xml");

        /**
         * this is for prototype bean scope type
         */
        TeacherPrototype prototype1 = context.getBean("teacherPrototype", TeacherPrototype.class);
        logger.info("{}",prototype1.hashCode());

        TeacherPrototype prototype2 = context.getBean("teacherPrototype", TeacherPrototype.class);
        logger.info("{}",prototype2.hashCode());


        /**
         * this is for prototype bean scope by XML
         */
        TeacherPrototype byXML1 = context.getBean("teacherPrototype", TeacherPrototype.class);
        logger.info("{}",byXML1.hashCode());

        TeacherPrototype byXML2 = context.getBean("teacherPrototype", TeacherPrototype.class);
        logger.info("{}",byXML2.hashCode());

    }
}
