package com.xworkz.impl;

import com.xworkz.interfaces.SmartDevice;

public class SmartDeviceImpl implements SmartDevice {
    public void powerOn() { System.out.println("Device ON"); }
    public void powerOff() { System.out.println("Device OFF"); }
    public void performTask() { System.out.println("Task running"); }
}