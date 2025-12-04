package com.spring.core.dec_25.basic.controller;

import com.spring.core.dec_25.basic.entity.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class StudentControllerTest {

    @Test
    void testStudentBeansLoadingFromSpringContext() {

        ApplicationContext context = new ClassPathXmlApplicationContext(
                "com/spring/core/dec_25/basic/configuration/studentconfiguration.xml");

        // fetch student1 bean
        Student student1 = context.getBean("student1", Student.class);
        assertNotNull(student1, "Student1 bean should not be null");
        assertNotNull(student1.getStudentName(), "Student1 name should not be null");

        // fetch student2 bean
        Student student2 = context.getBean("student2", Student.class);
        assertNotNull(student2, "Student2 bean should not be null");
        assertNotNull(student2.getStudentName(), "Student2 name should not be null");

        // Example assertion to validate field content (change values according to config)
        assertNotEquals(student1.getStudentName(), student2.getStudentName(), "Both students should not have same name");

    }
    @Test
    void testMainMethodRunsWithoutException() {
        String[] args = {};
        Assertions.assertDoesNotThrow(() -> StudentController.main(args));
    }
}
