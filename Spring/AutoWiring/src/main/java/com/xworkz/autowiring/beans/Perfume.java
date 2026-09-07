package com.xworkz.autowiring.beans;

import org.springframework.stereotype.Component;

@Component
public class Perfume {
    
    public Perfume() {
        System.out.println("Perfume bean created");
    }
}
