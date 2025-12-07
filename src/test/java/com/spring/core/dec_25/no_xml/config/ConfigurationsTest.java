package com.spring.core.dec_25.no_xml.config;

import com.spring.core.dec_25.no_xml.entity.Product;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ConfigurationsTest {

    @Test
    void testProductsBeanMethod() {
        Configurations config = new Configurations();
        Product product = config.products();   // Direct call to @Bean method

        assertNotNull(product);
        assertEquals(1612, product.getId());
        assertEquals("Apple", product.getName());

        List<Double> expectedPrices = Arrays.asList(55000.0, 60000.0, 65000.0);
        assertEquals(expectedPrices, product.getPrice());
    }
}
