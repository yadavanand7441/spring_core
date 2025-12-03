package com.spring.core.dec_25.constructor_injection.ambiguity.solution.controller;


import com.spring.core.dec_25.constructor_injection.ambiguity.solution.entity.Addition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AdditionController {
    public static void main(String[] args) {

        ApplicationContext additionContext = new ClassPathXmlApplicationContext("com/spring/core/dec_25/constructor_injection/ambiguity/solution/config/cfg.xml");
        Addition addition = additionContext.getBean("addition1", Addition.class);
        addition.doSum();

    }
}
