package com.xworkz.interfaces;

public interface SmartDevice {
    int BATTERY_CAPACITY = 5000;
    int WARRANTY_YEARS = 2;

    void powerOn();
    void powerOff();
    void performTask();
}