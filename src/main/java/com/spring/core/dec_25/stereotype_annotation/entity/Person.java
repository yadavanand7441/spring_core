package com.spring.core.dec_25.stereotype_annotation.entity;

import lombok.Getter;
import lombok.ToString;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * we can change the bean name with help of @Component annotation. make sure use same name in the controller
 * at the place of getBean("person",Person.class) method. see the below example
 */

@ToString
@Getter
@Component("p1")
public class Person {

    @Value("1232")
    private int personId;
    @Value("Rohan Sharma")
    private String personName;
    @Value("26")
    private int personAge;

    @Value("#{personList}")
    private List<String>addresses;

}
