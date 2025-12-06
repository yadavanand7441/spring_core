package com.spring.core.dec_25.autowire.by_xml.controller;

import com.spring.core.dec_25.autowire.by_xml.enity.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeAutoWireControllerTest {

    @Test
    void testEmployeeByConstructorBeanLoading() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/spring/core/dec_25/autowire/by_xml/config/cfg.xml");

        Employee employee = context.getBean("employeeByConstructor", Employee.class);

        assertNotNull(employee, "Employee bean should not be null");
        assertNotNull(employee.getEmployeeAddress(), "EmployeeAddress should not be null");
        assertTrue(employee.getEmployeeId() > 0, "EmployeeId should be greater than zero");

        System.out.println(employee);
    }

    @Test
    void testMainMethodRunsWithoutException() {
        String[] args = {};
        Assertions.assertDoesNotThrow(() -> EmployeeAutoWireController.main(args));
    }
}
