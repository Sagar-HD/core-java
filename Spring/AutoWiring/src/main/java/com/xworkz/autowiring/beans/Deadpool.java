package com.xworkz.autowiring.beans;

import org.springframework.stereotype.Component;

@Component
public class Deadpool {
    
    public Deadpool() {
        System.out.println("Deadpool bean created");
    }
}
