package com.spring.core.dec_25.autowire.annotation.entity;

import lombok.Setter;
import lombok.ToString;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

@ToString
@Setter
public class UserOnConstructor {
    private int uId;
    private String uName;
    private Product product;

    private static Logger logger = LoggerFactory.getLogger(UserOnSetterMethod.class);

    @Autowired
    public UserOnConstructor(int uId, String uName, Product product) {
        logger.info("annotation on constructor !");
        this.uId = uId;
        this.uName = uName;
        this.product = product;
    }
}
