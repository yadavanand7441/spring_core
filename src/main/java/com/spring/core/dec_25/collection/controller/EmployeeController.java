package com.spring.core.dec_25.collection.controller;

import com.spring.core.dec_25.collection.entity.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeController {
    public static void main(String[] args) {

        ApplicationContext employeeContext = new ClassPathXmlApplicationContext("com/spring/core/dec_25/collection/config/cfg.xml");
        Employee employee1 = employeeContext.getBean("employee1", Employee.class);
        System.out.println(employee1);
        System.out.println(employee1.getAddresses());

        // for employee2
        Employee employee2 = employeeContext.getBean("employee2", Employee.class);
        System.out.println(employee2);
    }
}
