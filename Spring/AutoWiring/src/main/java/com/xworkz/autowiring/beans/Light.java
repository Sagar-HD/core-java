package com.xworkz.autowiring.beans;

import org.springframework.stereotype.Component;

@Component
public class Light {
    
    public Light() {
        System.out.println("Light bean created");
    }
}
