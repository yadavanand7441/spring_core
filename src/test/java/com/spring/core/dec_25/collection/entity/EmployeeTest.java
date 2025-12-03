package com.spring.core.dec_25.collection.entity;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void testNoArgsConstructorAndSetters() {
        Employee emp = new Employee();
        emp.setAge(30);
        emp.setEmpName("Anand");
        emp.setAddresses(Arrays.asList("Kolkata", "Delhi"));
        emp.setEmpIds(new HashSet<>(Arrays.asList(101, 102)));
        HashMap<String, String> deptMap = new HashMap<>();
        deptMap.put("IT", "Development");
        deptMap.put("HR", "Recruitment");
        emp.setDepartments(deptMap);

        assertEquals(30, emp.getAge());
        assertEquals("Anand", emp.getEmpName());
        assertTrue(emp.getAddresses().contains("Delhi"));
        assertTrue(emp.getEmpIds().contains(101));
        assertEquals("Development", emp.getDepartments().get("IT"));
    }

    @Test
    void testAllArgsConstructor() {
        Employee emp = new Employee(
                25,
                "Ram",
                Arrays.asList("Mumbai", "Pune"),
                new HashSet<>(Arrays.asList(201, 202)),
                new HashMap<String, String>() {{
                    put("Finance", "Accounts");
                }}
        );

        assertEquals(25, emp.getAge());
        assertEquals("Ram", emp.getEmpName());
        assertEquals(2, emp.getAddresses().size());
        assertTrue(emp.getEmpIds().contains(201));
        assertEquals("Accounts", emp.getDepartments().get("Finance"));
    }

    @Test
    void testToStringContainsFields() {
        Employee emp = new Employee(
                40,
                "Shyam",
                Arrays.asList("Chennai"),
                new HashSet<>(Arrays.asList(301)),
                new HashMap<String, String>() {{
                    put("Admin", "Support");
                }}
        );

        String result = emp.toString();
        assertTrue(result.contains("Shyam"));
        assertTrue(result.contains("40"));
        assertTrue(result.contains("Chennai"));
        assertTrue(result.contains("Admin"));
    }
}
