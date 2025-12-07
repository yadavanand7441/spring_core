package com.spring.core.dec_25.stereotype_annotation.controller;

import com.spring.core.dec_25.stereotype_annotation.entity.BeanScopeByAnnotationSingleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeByAnnotationSingletonController {

    private static Logger logger = LoggerFactory.getLogger(PersonController.class);

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/core/dec_25/stereotype_annotation/config/cfg.xml");

        /**
         * this is for singleton bean scope type
         */

        BeanScopeByAnnotationSingleton annotationSingleton1 = context.getBean("beanScopeByAnnotationSingleton", BeanScopeByAnnotationSingleton.class);
        logger.info("{}",annotationSingleton1.hashCode());


        BeanScopeByAnnotationSingleton annotationSingleton2 = context.getBean("beanScopeByAnnotationSingleton", BeanScopeByAnnotationSingleton.class);
        logger.info("{}",annotationSingleton2.hashCode());

    }
}
