package com.xworkz.implementations.remoteImplementations;

import com.xworkz.interfaces.Remote;

public class TataRemote implements Remote {
    @Override
    public void turnOn() {
        System.out.println("turning on in tata remove");
    }

    @Override
    public void turnOff() {
        System.out.println("turning off in tata remote");
    }
}
