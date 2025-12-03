package com.spring.core.dec_25.constructor_injection.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    private int userId;
    private String userName;
    private String userAddress;

    // constructor-injection-packages
    public void User() {
        System.out.println("constructor-injection-packages");
    }
}
