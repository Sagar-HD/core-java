package com.xworkz.impl;

import com.xworkz.interfaces.Hospital;

public class HospitalImpl implements Hospital {
    public void admitPatient() { System.out.println("Patient admitted"); }
    public void dischargePatient() { System.out.println("Patient discharged"); }
    public void provideTreatment() { System.out.println("Treatment given"); }
}