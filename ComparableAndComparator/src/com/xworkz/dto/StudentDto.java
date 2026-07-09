package com.xworkz.dto;

public class StudentDto implements Comparable<StudentDto>{
    private int rollNo;
    private String name;
    private int marks;

    public StudentDto(int marks, String name, int rollNo) {
        this.marks = marks;
        this.name = name;
        this.rollNo = rollNo;
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    @Override
    public int compareTo(StudentDto o) {
        int cmp=Integer.compare(o.getMarks(),this.getMarks());
        if(cmp!=0){
            return cmp;
        }
        cmp=this.getName().compareTo(o.getName());
        if(cmp!=0){
            return cmp;
        }
        cmp=Integer.compare(this.getRollNo(),o.getRollNo());
        return cmp;
    }

    @Override
    public String toString() {
        return "StudentDto{" +
                "marks=" + marks +
                ", rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }
}
