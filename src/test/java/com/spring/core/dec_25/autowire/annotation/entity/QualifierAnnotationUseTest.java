package com.spring.core.dec_25.autowire.annotation.entity;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class QualifierAnnotationUseTest {

    @Test
    void testQualifierAnnotationUseBeanCreation() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/core/dec_25/autowire/annotation/config/cfg.xml");

        QualifierAnnotationUse qualifierBean = context.getBean("qualifierAnnotationUse", QualifierAnnotationUse.class);

        assertNotNull(qualifierBean, "Bean should not be null");
        assertEquals(6334, qualifierBean.getPersonId());
        assertEquals("Rahul", qualifierBean.getPersonName());
        assertNotNull(qualifierBean.getProduct());
        assertEquals("Tony", qualifierBean.getProduct().getProductName());
    }
}
