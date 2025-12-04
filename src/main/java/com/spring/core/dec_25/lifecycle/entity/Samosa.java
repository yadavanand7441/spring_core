package com.spring.core.dec_25.lifecycle.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@NoArgsConstructor
@ToString
@Getter
@Setter
@AllArgsConstructor
public class Samosa {
    private double price;

    private Logger logger = LoggerFactory.getLogger(Samosa.class);

    public void init()
    {
        logger.info("Inside init method:");
    }
    public void destroy()
    {
        System.out.println("Inside destroy method:");
    }
}
