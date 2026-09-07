package com.xworkz.autowiring.beans;

import org.springframework.stereotype.Component;

@Component
public class Plant {
    
    public Plant() {
        System.out.println("Plant bean created");
    }
}
