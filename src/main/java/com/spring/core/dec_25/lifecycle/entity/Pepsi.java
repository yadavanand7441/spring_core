package com.spring.core.dec_25.lifecycle.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;



@Setter
@Getter
@ToString
public class Pepsi implements InitializingBean, DisposableBean {
    private double price;

    private Logger logger = LoggerFactory.getLogger(Pepsi.class);

    @Override
    public void afterPropertiesSet() {
        logger.info("Using interface in spring-lifecycle: inside init method");
    }

    @Override
    public void destroy() {
        logger.info("Using interface in spring-lifecycle: inside destroy method");
    }
}
