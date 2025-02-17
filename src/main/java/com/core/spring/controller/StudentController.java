package com.core.spring.controller;

import com.core.spring.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentController {
    public static void main(String[] args) {

        ApplicationContext studentContext = new ClassPathXmlApplicationContext("com/core/spring/configuration/config.xml");
        Student studentContextBean1 = studentContext.getBean("student1", Student.class);
        System.out.println(studentContextBean1);

        Student studentContextBean2 = studentContext.getBean("student2", Student.class);
        System.out.println(studentContextBean2);

    }
}
