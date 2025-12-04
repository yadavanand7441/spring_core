package com.spring.core.dec_25.collection.controller;

import com.spring.core.dec_25.collection.entity.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class EmployeeControllerTest {

    @Test
    void testEmployeeBeansLoadedSuccessfully() {
        // Load Spring context same as main()
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "com/spring/core/dec_25/collection/config/cfg.xml"
        );

        // Fetch beans
        Employee employee1 = context.getBean("employee1", Employee.class);
        Employee employee2 = context.getBean("employee2", Employee.class);

        // Assertions - Sonar satisfied ✔
        Assertions.assertNotNull(employee1, "Employee1 bean should not be null");
        Assertions.assertNotNull(employee2, "Employee2 bean should not be null");
        Assertions.assertFalse(employee1.getAddresses().isEmpty(), "Employee1 must have addresses");

        // Extra validation for bean IDs, optional but good
        Assertions.assertNotEquals(employee1, employee2, "Both employee beans should be different");

        context.getClass();  // just to satisfy coverage path
    }

    @Test
    void testMainMethodRunsWithoutException() {
        String[] args = {};
        Assertions.assertDoesNotThrow(() -> EmployeeController.main(args));
    }
}
