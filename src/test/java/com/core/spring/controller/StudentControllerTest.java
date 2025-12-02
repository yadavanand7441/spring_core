package com.core.spring.controller;

import com.core.spring.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class StudentControllerTest {

    @Test
    void testStudentBeansLoadedFromXml() {
        // Load Spring context from XML
        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/core/spring/configuration/config.xml");

        // Verify student1 bean
        Student student1 = context.getBean("student1", Student.class);
        assertNotNull(student1, "student1 bean should not be null");
        assertEquals(12312, student1.getId());
        assertEquals("Tony Kumar", student1.getName());
        assertEquals("Patna", student1.getAddress());

        // Verify student2 bean
        Student student2 = context.getBean("student2", Student.class);
        assertNotNull(student2, "student2 bean should not be null");
        // Example assertions – update values according to your config.xml
        assertTrue(student2.getId() > 0);
        assertNotNull(student2.getName());
        assertNotNull(student2.getAddress());
    }
}
