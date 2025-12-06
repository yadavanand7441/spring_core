package com.spring.core.dec_25.autowire.by_xml.controller;

import com.spring.core.dec_25.autowire.by_xml.enity.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeAutoWireController {

    private static Logger logger = LoggerFactory.getLogger(EmployeeAutoWireController.class);

    public static void main(String[] args) {

        ApplicationContext employeeContext = new ClassPathXmlApplicationContext("com/spring/core/dec_25/autowire/by_xml/config/cfg.xml");

        /**
        * byName auto-wire
         */
       /* Employee employeeByName = employeeContext.getBean("employeeByName", Employee.class);
        logger.info("employee data byName auto-wire: {}",employeeByName);*/

        /**
         * byType auto-wire
         */
        /*Employee employeeByType = employeeContext.getBean("employeeByType", Employee.class);
        logger.info("employee data byName auto-wire: {}",employeeByType);*/

        /**
         * byConstructor auto-wire
         */
        Employee employeeByConstructor = employeeContext.getBean("employeeByConstructor", Employee.class);
        logger.info("employee data byName auto-wire: {}",employeeByConstructor);
    }
}
