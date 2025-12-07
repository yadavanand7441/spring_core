package com.spring.core.dec_25.stereotype_annotation.entity;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testPersonBeanLoadedCorrectly() {

        // Load Spring Context
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "com/spring/core/dec_25/stereotype_annotation/config/cfg.xml"
        );

        // Fetch bean
        Person person = context.getBean("p1", Person.class);

        // Assertions
        assertNotNull(person, "Person bean should not be null");
        assertEquals(1232, person.getPersonId());
        assertEquals("Rohan Sharma", person.getPersonName());
        assertEquals(26, person.getPersonAge());

        // Validate list
        List<String> addressList = person.getAddresses();
        assertNotNull(addressList);
        assertEquals(4, addressList.size());
        assertTrue(addressList.contains("Patna"));
        assertTrue(addressList.contains("Muzaffapur"));
        assertTrue(addressList.contains("Gaya"));
        assertTrue(addressList.contains("Mumbai"));
    }
}
