package com.xworkz.runner;

import com.xworkz.engines.CarEngine;
import com.xworkz.vehicle.Car;

public class Main {
    public static void main(String[] args) {
        CarEngine carEngine=new CarEngine("1990",200);
        Car car = new Car("red",carEngine);
        car.display();
    }
}
