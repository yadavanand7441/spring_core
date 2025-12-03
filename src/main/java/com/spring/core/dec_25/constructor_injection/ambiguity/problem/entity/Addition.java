package com.spring.core.dec_25.constructor_injection.ambiguity.problem.entity;

import lombok.ToString;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ToString
public class Addition {

    private static final Logger logger = LoggerFactory.getLogger(Addition.class);

    private int a;
    private int b;

    public Addition(int a, int b) {
        this.a = a;
        this.b = b;
        logger.info("Constructor: int, int");
    }

    public Addition(double a, double b) {
        this.a = (int) a;
        this.b = (int) b;
        logger.info("Constructor: double, double");
    }

    public Addition(String a, String b) {
        this.a = Integer.parseInt(a);
        this.b = Integer.parseInt(b);
        logger.info("Constructor: String, String");
    }

    public void doSum() {
        logger.info("Sum is: {}", (this.a + this.b));
    }
}
