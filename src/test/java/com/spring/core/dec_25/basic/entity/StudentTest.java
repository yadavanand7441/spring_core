package com.spring.core.dec_25.basic.entity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testDefaultConstructorAndSetters() {
        Student student = new Student();
        student.setStudentId(101);
        student.setStudentName("Ram");
        student.setStudentAddress("Delhi");

        assertEquals(101, student.getStudentId());
        assertEquals("Ram", student.getStudentName());
        assertEquals("Delhi", student.getStudentAddress());
    }

    @Test
    void testParameterizedConstructor() {
        Student student = new Student(102, "Shyam", "Mumbai");

        assertEquals(102, student.getStudentId());
        assertEquals("Shyam", student.getStudentName());
        assertEquals("Mumbai", student.getStudentAddress());
    }

    @Test
    void testToString() {
        Student student = new Student(103, "Geeta", "Kolkata");
        String result = student.toString();

        assertTrue(result.contains("103"));
        assertTrue(result.contains("Geeta"));
        assertTrue(result.contains("Kolkata"));
    }
}
