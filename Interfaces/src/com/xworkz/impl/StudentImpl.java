package com.xworkz.impl;

import com.xworkz.interfaces.Student;

public class StudentImpl implements Student {
    public void study() { System.out.println("Student studying"); }
    public void takeExam() { System.out.println("Student taking exam"); }
    public void checkResult() { System.out.println("Result checked"); }
}