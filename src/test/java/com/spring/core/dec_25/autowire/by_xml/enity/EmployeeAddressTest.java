package com.spring.core.dec_25.autowire.by_xml.enity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeAddressTest {

    @Test
    void testSettersAndGetters() {
        EmployeeAddress address = new EmployeeAddress();

        address.setStreet("MG Road");
        address.setCity("Delhi");
        address.setZipCode("110001");
        address.setDistrict("North Delhi");
        address.setState("Delhi");
        address.setCountry("India");

        assertEquals("MG Road", address.getStreet());
        assertEquals("Delhi", address.getCity());
        assertEquals("110001", address.getZipCode());
        assertEquals("North Delhi", address.getDistrict());
        assertEquals("Delhi", address.getState());
        assertEquals("India", address.getCountry());
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

        String expected = "EmployeeAddress{street='MG Road', city='Delhi', zipCode='110001', state='Delhi', country='India'}";
        assertEquals(expected, address.toString());
    }
}
