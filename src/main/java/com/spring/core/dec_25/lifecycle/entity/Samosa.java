package com.spring.core.dec_25.lifecycle.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.AllArgsConstructor;

@NoArgsConstructor
@ToString
@Getter
@Setter
@AllArgsConstructor
public class Samosa {
    private double price;


    public void init()
    {
        System.out.println("Inside init method:");
    }
    public void destroy()
    {
        System.out.println("Inside destroy method:");
    }
}
