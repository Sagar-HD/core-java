package com.xworkz.engines;

public class CarEngine {
    private double torque;
   private String model;

    public CarEngine(String model, double torque) {
        this.model = model;
        this.torque = torque;
    }
    public void display() {
        System.out.println("Model: " + model);
        System.out.println("Torque: " + torque);
    }
}
