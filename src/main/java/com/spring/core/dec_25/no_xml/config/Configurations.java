package com.spring.core.dec_25.no_xml.config;

import com.spring.core.dec_25.no_xml.entity.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "com.spring.core.dec_25.no_xml.entity")
public class Configurations {

    /**
     * @Bean(name = "address")
    public Address address() {
    return new Address("Simtoka", "Aurai", "Muzaffarpur", "Bihar", "843312", "India");
    }*/

    @Bean(name = "products")
    public Product products()
    {
        Product product = new Product();
        product.setId(1612);
        product.setName("Apple");

        List<Double> priceList = new ArrayList<>();
        priceList.add(55000.0);
        priceList.add(60000.0);
        priceList.add(65000.0);

        product.setPrice(priceList);
        return product;
    }
}
