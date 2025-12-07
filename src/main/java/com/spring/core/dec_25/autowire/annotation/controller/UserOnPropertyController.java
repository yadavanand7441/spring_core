package com.spring.core.dec_25.autowire.annotation.controller;

import com.spring.core.dec_25.autowire.annotation.entity.QualifierAnnotationUse;
import com.spring.core.dec_25.autowire.annotation.entity.UserOnConstructor;
import com.spring.core.dec_25.autowire.annotation.entity.UserOnProperty;
import com.spring.core.dec_25.autowire.annotation.entity.UserOnSetterMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserOnPropertyController {

    private static Logger logger = LoggerFactory.getLogger(UserOnPropertyController.class);

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/core/dec_25/autowire/annotation/config/cfg.xml");

        /**
         * example for auto-wire using annotation on property
         * */
        UserOnProperty userOnProperty = context.getBean("annotationOnProperty", UserOnProperty.class);
        logger.info("user record:{} ",userOnProperty);

        /**
         * example for auto-wire using annotation on setter-method concept
         * */
        UserOnSetterMethod annotationOnSetterMethod = context.getBean("annotationOnSetterMethod", UserOnSetterMethod.class);
        logger.info("user record:{} ",annotationOnSetterMethod);

        /**
         * example for auto-wire using annotation on constructor-concept
         * */
        UserOnConstructor userOnConstructor = context.getBean("annotationOnConstructor", UserOnConstructor.class);
        logger.info("user record {}",userOnConstructor);

        /**
         * example for auto-wire using annotation on constructor-concept
         * */
        QualifierAnnotationUse qualifierAnnotationUse = context.getBean("qualifierAnnotationUse", QualifierAnnotationUse.class);
        logger.info("user record {}",qualifierAnnotationUse);

    }
}
