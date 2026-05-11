package com.xworkz.implementation;

import com.xworkz.interfaces.Vehicle;

public class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }

    public static void main(String[] args) {

        Vehicle vehicle = new Car();

        Vehicle.staticInfo();
        vehicle.vehicleInfo();
        vehicle.vehicleDetails();
        vehicle.start();
        vehicle.stop();
    }
}