package com.spring.core.dec_25.controller;

import com.spring.core.dec_25.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class StudentControllerTest {

    @Test
    void testStudentBeansLoadedFromXml() {
        // Load Spring context from XML
        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/spring/core/dec_25/configuration/studentconfiguration.xml");

        // Verify student1 bean
        Student student1 = context.getBean("student1", Student.class);
        assertNotNull(student1);
        assertEquals(12341, student1.getStudentId());
        assertEquals("Sonam Kapoor", student1.getStudentName());
        assertEquals("Mumbai", student1.getStudentAddress());

        // Verify student2 bean (assuming defined in XML)
        Student student2 = context.getBean("student2", Student.class);
        assertNotNull(student2);
        // Example assertions – update values according to your XML
        assertTrue(student2.getStudentId() > 0);
        assertNotNull(student2.getStudentName());
        assertNotNull(student2.getStudentAddress());
    }
}
