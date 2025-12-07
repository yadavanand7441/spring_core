package com.spring.core.dec_25.no_xml.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@ToString
@Component("address")
public class Address {
    @Value("simtoka")
    private String street;
    @Value("Aurai")
    private String city;
    @Value("Muzaffarpur")
    private String district;
    @Value("Bihar")
    private String state;
    @Value("843312")
    private String zipCode;
    @Value("India")
    private String country;
}
