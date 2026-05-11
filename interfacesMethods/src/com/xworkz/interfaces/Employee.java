
package com.xworkz.interfaces;

public interface Employee {

    int salary = 50000;
    String company = "Infosys";
    String role = "Developer";

    void work();
    void attendMeeting();

    default void employeeInfo() {
        System.out.println("Employees work in companies");
    }

    default void employeeDetails() {
        System.out.println("Salary: " + salary);
        System.out.println("Company: " + company);
        System.out.println("Role: " + role);
    }

    static void staticInfo() {
        System.out.println("I am Employee Interface");
    }
}