package com.spring.core.dec_25.autowire.by_xml.enity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Employee
{
    private int employeeId;
    private String employeeName;
    private EmployeeAddress employeeAddress;

    private static Logger logger = LoggerFactory.getLogger(Employee.class);

    public Employee(int employeeId, String employeeName, EmployeeAddress employeeAddress) {
        logger.info("setting address by constructor");
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public EmployeeAddress getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(EmployeeAddress employeeAddress) {
        logger.info("setting employee address!");
        this.employeeAddress = employeeAddress;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeAddress=" + employeeAddress +
                '}';
    }
}
