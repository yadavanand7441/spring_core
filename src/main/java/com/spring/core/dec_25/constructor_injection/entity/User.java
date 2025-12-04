package com.spring.core.dec_25.constructor_injection.entity;

import lombok.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

    private static final Logger logger = LoggerFactory.getLogger(User.class);

    private int userId;
    private String userName;
    private String userAddress;

}
