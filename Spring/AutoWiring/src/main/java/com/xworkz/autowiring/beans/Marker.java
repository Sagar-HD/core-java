package com.xworkz.autowiring.beans;

import org.springframework.stereotype.Component;

@Component
public class Marker {
    
    public Marker() {
        System.out.println("Marker bean created");
    }
}
