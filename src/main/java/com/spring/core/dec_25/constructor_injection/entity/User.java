package com.spring.core.dec_25.constructor_injection.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class User {

    private static final Logger logger = LoggerFactory.getLogger(User.class);

    private int userId;
    private String userName;
    private String userAddress;

    // constructor-injection-packages
    public User() {
        logger.info("constructor-injection-packages");
    }
}
