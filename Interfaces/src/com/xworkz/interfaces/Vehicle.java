package com.xworkz.interfaces;

public interface Vehicle {
    int MAX_SPEED = 180;
    int WHEELS = 4;

    void start();
    void stop();
    void accelerate();
}