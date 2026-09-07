package com.xworkz.autowiring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Container {
    
    private Glass glass;
    
    public Container() {
        System.out.println("Container bean created");
    }
    
    @Autowired
    public void setGlass(Glass glass) {
        System.out.println("now injecting these beans: Glass");
        this.glass = glass;
    }
}
