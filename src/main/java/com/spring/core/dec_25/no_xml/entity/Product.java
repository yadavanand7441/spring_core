package com.spring.core.dec_25.no_xml.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.List;
@Setter
@Getter
@ToString
@NoArgsConstructor
@Component
public class Product {
    private int id;
    private String name;
    private List<Double>price;
}
