package com.xworkz.impl;

import com.xworkz.interfaces.Teacher;

public class TeacherImpl implements Teacher {
    public void teach() { System.out.println("Teaching"); }
    public void assignHomework() { System.out.println("Homework assigned"); }
    public void evaluateStudent() { System.out.println("Evaluating students"); }
}