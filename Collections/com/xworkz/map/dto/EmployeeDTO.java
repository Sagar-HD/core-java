package com.xworkz.map.dto;

import java.io.Serializable;
import java.util.Objects;

public class EmployeeDTO implements Serializable {
    private int id;
    private String name;
    private String email;
    private String department;

    public EmployeeDTO(int id, String name, String email, String department) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeDTO that = (EmployeeDTO) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(email, that.email) && Objects.equals(department, that.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, department);
    }

    @Override
    public String toString() {
        return "EmployeeDTO [id=" + id + ", name=" + name + ", email=" + email + ", department=" + department + "]";
    }
}
