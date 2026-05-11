
package com.xworkz.implementation;

import com.xworkz.interfaces.Employee;

public class Developer implements Employee {

    @Override
    public void work() {
        System.out.println("Developer writes code");
    }

    @Override
    public void attendMeeting() {
        System.out.println("Developer attends meeting");
    }

    public static void main(String[] args) {

        Employee employee = new Developer();

        Employee.staticInfo();
        employee.employeeInfo();
        employee.employeeDetails();
        employee.work();
        employee.attendMeeting();
    }
}