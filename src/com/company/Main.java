package com.company;

public class Main {

    public static void main(String[] args) {
	    EmployeeFactory factory1 = new DeveloperFactory();
        Employee employee = factory1.createEmployee();
        employee.work();

        EmployeeFactory factory2 = new SMMManagerFactory();
        Employee employee1 = factory2.createEmployee();
        employee1.work();
    }
}
