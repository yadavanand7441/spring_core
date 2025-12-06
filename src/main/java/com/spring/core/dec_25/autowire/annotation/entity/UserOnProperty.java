package com.spring.core.dec_25.autowire.annotation.entity;


import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

@Setter
@ToString

public class UserOnProperty {

    private int userId;
    private String userName;

    @Autowired
    private Product product;


}
