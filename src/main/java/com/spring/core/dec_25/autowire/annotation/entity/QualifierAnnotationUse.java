package com.spring.core.dec_25.autowire.annotation.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Getter
@ToString
@Setter
@AllArgsConstructor
public class QualifierAnnotationUse {
    private int personId;
    private String personName;
    @Autowired
    @Qualifier("product1")
    private Product product;
}
