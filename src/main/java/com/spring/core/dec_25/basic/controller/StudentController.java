package com.spring.core.dec_25.basic.controller;

import com.spring.core.dec_25.basic.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentController {
    public static void main(String[] args) {

        ApplicationContext studentContext = new ClassPathXmlApplicationContext("com/spring/core/dec_25/basic/configuration/studentconfiguration.xml");
        Student studentContextBean1 = studentContext.getBean("student1", Student.class);
        System.out.println("Student1 data is: "+ studentContextBean1);

        Student student2 = studentContext.getBean("student2", Student.class);
        System.out.println("Student2 data is: "+ student2);
    }
}
