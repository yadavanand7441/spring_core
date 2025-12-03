package com.spring.core.dec_25.basic.controller;

import com.spring.core.dec_25.basic.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class StudentControllerTest {

    @Test
    void testStudentBeansLoadedFromContext() {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "com/spring/core/dec_25/basic/configuration/studentconfiguration.xml");

        Student student1 = context.getBean("student1", Student.class);
        Student student2 = context.getBean("student2", Student.class);

        assertNotNull(student1, "student1 bean should not be null");
        assertNotNull(student2, "student2 bean should not be null");

        // Example property checks (adjust as per your Student entity fields)
        assertEquals("Sonam Kapoor", student1.getStudentName());
        assertEquals("Mohan Rohan", student2.getStudentName());
    }
}

