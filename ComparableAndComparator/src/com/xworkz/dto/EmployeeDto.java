package com.xworkz.dto;

public class EmployeeDto implements Comparable<EmployeeDto>{
    private int id;
    private String name;

    public EmployeeDto(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(EmployeeDto o) {
        int compareVal= Integer.compare(this.getName().length(),o.getName().length());
        if(compareVal!=0){
            return compareVal;
        }
        compareVal= this.name.compareTo(o.name);
        return compareVal;
    }

    @Override
    public String toString() {
        return "EmployeeDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
