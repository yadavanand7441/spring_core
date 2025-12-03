package com.spring.core.dec_25.collection.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {
    private int age;
    private String empName;
    private List<String> addresses;
    private Set<Integer> empIds;
    private Map<String, String> departments;
}
