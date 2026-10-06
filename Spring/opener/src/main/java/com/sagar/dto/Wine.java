package com.sagar.dto;

import javax.validation.constraints.Min;

public class Wine {

    private String companyName;
    private String manfDate;
    
    @Min(value = 2, message = "Age must be at least 2")
    private int age;
    
    private String manfName;

    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }


    public String getManfDate() {
        return manfDate;
    }
    public void setManfDate(String manfDate) {
        this.manfDate = manfDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getManfName() {
        return manfName;
    }
    public void setManfName(String manfName) {
        this.manfName = manfName;
    }

    public Wine(String companyName, String manfDate, int age, String manfName) {
        this.companyName = companyName;
        this.manfDate = manfDate;
        this.age = age;
        this.manfName = manfName;
    }

    public Wine() {
        System.out.println("wine constructor called");
    }

    @Override
    public String toString() {
        return "Wine [companyName=" + companyName + ", manfDate=" + manfDate + ", age=" + age + ", manfName=" + manfName
                + "]";
    }
}
