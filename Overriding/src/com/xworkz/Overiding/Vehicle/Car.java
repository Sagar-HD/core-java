package com.xworkz.Overiding.Vehicle;

public class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Car drives itself (self drive)");
    }
}