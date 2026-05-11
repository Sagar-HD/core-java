
package com.xworkz.implementation;

import com.xworkz.interfaces.Device;

public class Mobile implements Device {

    @Override
    public void switchOn() {
        System.out.println("Mobile switched ON");
    }

    @Override
    public void switchOff() {
        System.out.println("Mobile switched OFF");
    }

    public static void main(String[] args) {

        Device device = new Mobile();

        Device.staticInfo();
        device.deviceInfo();
        device.deviceDetails();
        device.switchOn();
        device.switchOff();
    }
}