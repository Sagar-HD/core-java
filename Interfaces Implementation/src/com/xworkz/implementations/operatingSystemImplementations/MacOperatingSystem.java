package com.xworkz.implementations.operatingSystemImplementations;

import com.xworkz.interfaces.OperatingSystem;

public class MacOperatingSystem implements OperatingSystem {
    @Override
    public void boot() {
        System.out.println("booting in mac os");
    }

    @Override
    public void start() {
        System.out.println("starting in mac os");
    }

    @Override
    public void stop() {
        System.out.println("stopping in mac os");
    }
}
