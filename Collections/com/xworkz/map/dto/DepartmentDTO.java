package com.xworkz.map.dto;

import java.io.Serializable;
import java.util.Objects;

public class DepartmentDTO implements Serializable,Comparable<DepartmentDTO> {
    private String name;
    private String location;
    private int employeeCount;
    private double budget;

    public DepartmentDTO(String name, String location, int employeeCount, double budget) {
        this.name = name;
        this.location = location;
        this.employeeCount = employeeCount;
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public double getBudget() {
        return budget;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DepartmentDTO that = (DepartmentDTO) o;
        return employeeCount == that.employeeCount && Double.compare(budget, that.budget) == 0 && Objects.equals(name, that.name) && Objects.equals(location, that.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location,employeeCount,budget);
    }

    @Override
    public String toString() {
        return "DepartmentDTO [name=" + name + ", location=" + location + ", employeeCount=" + employeeCount + ", budget=" + budget + "]";
    }

    @Override
    public int compareTo(DepartmentDTO o) {
        return Integer.compare(this.employeeCount,o.employeeCount);
    }
}
