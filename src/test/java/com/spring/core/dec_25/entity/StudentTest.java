package com.spring.core.dec_25.entity;

import com.spring.core.dec_25.basic.entity.Student;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testDefaultConstructorAndSetters() {
        Student student = new Student();
        student.setStudentId(101);
        student.setStudentName("Anand");
        student.setStudentAddress("Kolkata");

        assertEquals(101, student.getStudentId());
        assertEquals("Anand", student.getStudentName());
        assertEquals("Kolkata", student.getStudentAddress());
    }

    @Test
    void testParameterizedConstructor() {
        Student student = new Student(202, "Sonam Kapoor", "Mumbai");

        assertEquals(202, student.getStudentId());
        assertEquals("Sonam Kapoor", student.getStudentName());
        assertEquals("Mumbai", student.getStudentAddress());
    }

    @Test
    void testToString() {
        Student student = new Student(303, "Rahul", "Delhi");
        String result = student.toString();

        assertTrue(result.contains("303"));
        assertTrue(result.contains("Rahul"));
        assertTrue(result.contains("Delhi"));
    }
}
