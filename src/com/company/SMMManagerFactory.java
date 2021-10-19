package com.company;

public class SMMManagerFactory implements EmployeeFactory{
    @Override
    public Employee createEmployee() {
        return new SMMManager();
    }
}
