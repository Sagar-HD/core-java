package com.xworkz.interfaces;

public interface Vehicle {
    int wheels = 4;
    String type = "Transport";
    String fuel = "Petrol";

    void start();
    void stop();

    default void vehicleInfo() {
        System.out.println("Vehicle is used for transportation");
    }

    default void vehicleDetails() {
        System.out.println("Wheels: " + wheels);
        System.out.println("Type: " + type);
        System.out.println("Fuel: " + fuel);
    }

    static void staticInfo() {
        System.out.println("I am Vehicle Interface");
    }
}