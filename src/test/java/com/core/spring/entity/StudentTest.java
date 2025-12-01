package com.core.spring.entity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testDefaultConstructorAndSetters() {
        Student student = new Student();
        student.setId(1);
        student.setName("Anand");
        student.setAddress("Kolkata");

        assertEquals(1, student.getId());
        assertEquals("Anand", student.getName());
        assertEquals("Kolkata", student.getAddress());
    }

    @Test
    void testParameterizedConstructor() {
        Student student = new Student(2, "Rahul", "Delhi");

        assertEquals(2, student.getId());
        assertEquals("Rahul", student.getName());
        assertEquals("Delhi", student.getAddress());
    }

    @Test
    void testToString() {
        Student student = new Student(3, "Priya", "Mumbai");
        String expected = "Student{id=3, name='Priya', address='Mumbai'}";
        assertEquals(expected, student.toString());
    }
}
