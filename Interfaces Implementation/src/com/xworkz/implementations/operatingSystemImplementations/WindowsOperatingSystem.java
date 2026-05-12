package com.xworkz.implementations.operatingSystemImplementations;

import com.xworkz.interfaces.OperatingSystem;

public class WindowsOperatingSystem implements OperatingSystem {
    @Override
    public void boot() {
        System.out.println("booting in windows os");
    }

    @Override
    public void start() {
        System.out.println("starting in windows os");

    }

    @Override
    public void stop() {
        System.out.println("stopping in windows os");
    }
}
