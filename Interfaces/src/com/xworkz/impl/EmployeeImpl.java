package com.xworkz.impl;

import com.xworkz.interfaces.Employee;

public  class EmployeeImpl implements Employee {
    public void work() { System.out.println("Working"); }
    public void attendMeeting() { System.out.println("Meeting attended"); }
    public void submitReport() { System.out.println("Report submitted"); }
}