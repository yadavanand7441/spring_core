package com.spring.core.dec_25.collection.controller;

import com.spring.core.dec_25.collection.entity.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeController {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    public static void main(String[] args) {

        ApplicationContext employeeContext = new ClassPathXmlApplicationContext(
                "com/spring/core/dec_25/collection/config/cfg.xml");

        Employee employee1 = employeeContext.getBean("employee1", Employee.class);
        logger.info("Employee1 data : {}", employee1);
        logger.info("Employee1 addresses : {}", employee1.getAddresses());

        // for employee2
        Employee employee2 = employeeContext.getBean("employee2", Employee.class);
        logger.info("Employee2 data : {}", employee2);
    }
}
