package com.spring.core.dec_25.no_xml.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@ToString
@Setter
@Getter
@NoArgsConstructor
@Component("user")
public class User {
    @Value("123")
    private int userId;
    @Value("Raju Kumar")
    private String userName;
    @Value("12")
    private int userAge;
    @Value("#{address}")
    private Address address;


}
