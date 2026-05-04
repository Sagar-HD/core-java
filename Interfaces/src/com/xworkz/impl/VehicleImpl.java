package com.xworkz.impl;

import com.xworkz.interfaces.Vehicle;

public class VehicleImpl implements Vehicle {
    public void start() { System.out.println("Vehicle started"); }
    public void stop() { System.out.println("Vehicle stopped"); }
    public void accelerate() { System.out.println("Accelerating"); }
}