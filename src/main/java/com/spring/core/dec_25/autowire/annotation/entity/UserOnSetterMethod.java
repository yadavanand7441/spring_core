package com.spring.core.dec_25.autowire.annotation.entity;

import lombok.ToString;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

@ToString
public class UserOnSetterMethod {
    private int id;
    private String name;
    private Product product;

    private static Logger logger = LoggerFactory.getLogger(UserOnSetterMethod.class);

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Autowired
    public void setProduct(Product product) {
        logger.info("annotation on setter method !");
        this.product = product;
    }
}
