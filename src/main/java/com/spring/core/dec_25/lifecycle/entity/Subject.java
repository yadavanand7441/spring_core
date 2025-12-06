package com.spring.core.dec_25.lifecycle.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@ToString
@Setter
@Getter
public class Subject {
    private String maths;
    private String english;
    private String physics;
    @ToString.Exclude
    private Logger logger = LoggerFactory.getLogger(Subject.class);


    @PostConstruct
    public void start()
    {
        logger.info("Using @PostConstruct annotation: inside start method");
    }
    @PreDestroy
    public void end()
    {
        logger.info("Using @PreDestroy annotation: inside destroy method");
    }
}
