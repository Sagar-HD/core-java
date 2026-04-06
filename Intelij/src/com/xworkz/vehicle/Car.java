package com.xworkz.vehicle;

import com.xworkz.engines.CarEngine;

public class Car {
    private CarEngine engine;
    private String color;

    public Car(String color, CarEngine engine) {
        this.color = color;
        this.engine = engine;
    }
    public void display() {
        System.out.println("color: " + this.color);
        engine.display();
    }
}
