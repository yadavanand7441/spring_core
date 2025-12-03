package com.spring.core.dec_25.collection.controller;

import com.spring.core.dec_25.collection.entity.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeControllerTest {

    @Test
    void testEmployeeBeansLoadedFromContext() {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "com/spring/core/dec_25/collection/config/cfg.xml");

        Employee employee1 = context.getBean("employee1", Employee.class);
        Employee employee2 = context.getBean("employee2", Employee.class);

        assertNotNull(employee1, "employee1 bean should not be null");
        assertNotNull(employee2, "employee2 bean should not be null");

        // Example property checks (adjust according to your cfg.xml values)
        assertNotNull(employee1.getAddresses(), "employee1 addresses should not be null");
        assertTrue(employee1.getAddresses().size() > 0, "employee1 should have at least one address");

        assertNotNull(employee2.getEmpName(), "employee2 name should not be null");
    }
}
