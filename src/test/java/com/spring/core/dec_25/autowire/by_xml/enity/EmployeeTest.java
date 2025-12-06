package com.spring.core.dec_25.autowire.by_xml.enity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void testConstructorAndGetters() {
        EmployeeAddress address = new EmployeeAddress();
        address.setStreet("MG Road");
        address.setCity("Delhi");
        address.setZipCode("110001");
        address.setDistrict("North Delhi");
        address.setState("Delhi");
        address.setCountry("India");

        Employee employee = new Employee(101, "Anand", address);

        assertEquals(101, employee.getEmployeeId());
        assertEquals("Anand", employee.getEmployeeName());
        assertEquals(address, employee.getEmployeeAddress());
    }

    @Test
    void testSetters() {
        EmployeeAddress address = new EmployeeAddress();
        Employee employee = new Employee(101, "Anand", address);

        employee.setEmployeeId(202);
        employee.setEmployeeName("Rohan");

        EmployeeAddress newAddress = new EmployeeAddress();
        newAddress.setCity("Mumbai");

        employee.setEmployeeAddress(newAddress);

        assertEquals(202, employee.getEmployeeId());
        assertEquals("Rohan", employee.getEmployeeName());
        assertEquals(newAddress, employee.getEmployeeAddress());
    }

    @Test
    void testToString() {
        EmployeeAddress address = new EmployeeAddress();
        address.setStreet("MG Road");
        address.setCity("Delhi");
        address.setZipCode("110001");
        address.setDistrict("North Delhi");
        address.setState("Delhi");
        address.setCountry("India");

        Employee employee = new Employee(101, "Anand", address);

        String expected = "Employee{employeeId=101, employeeName='Anand', employeeAddress=" + address + "}";
        assertEquals(expected, employee.toString());
    }
}
