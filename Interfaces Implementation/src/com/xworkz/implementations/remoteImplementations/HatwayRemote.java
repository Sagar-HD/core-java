package com.xworkz.implementations.remoteImplementations;

import com.xworkz.interfaces.Remote;

public class HatwayRemote implements Remote {
    @Override
    public void turnOn() {
        System.out.println("turning on in hathway remote");
    }

    @Override
    public void turnOff() {
        System.out.println("turning off in hatway remote");
    }
}
