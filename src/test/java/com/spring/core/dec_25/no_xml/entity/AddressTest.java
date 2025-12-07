package com.spring.core.dec_25.no_xml.entity;

import com.spring.core.dec_25.no_xml.config.UserConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class AddressTest {

    @Test
    void testAddressBean_loadedCorrectly() {

        ApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);
        Address address = context.getBean("address", Address.class);

        assertNotNull(address);
        assertEquals("simtoka", address.getStreet());
        assertEquals("Aurai", address.getCity());
        assertEquals("Muzaffarpur", address.getDistrict());
        assertEquals("Bihar", address.getState());
        assertEquals("843312", address.getZipCode());
        assertEquals("India", address.getCountry());
    }
}
