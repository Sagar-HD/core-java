package com.xworkz.collectioninterface;

public class EmployeeDTO {
    private int employeeId;
    private String name;
    private String department;
    private String designation;
    private double salary;

    public EmployeeDTO() {
    }

    public EmployeeDTO(int employeeId, String name, String department, String designation, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                '}';
    }
}

