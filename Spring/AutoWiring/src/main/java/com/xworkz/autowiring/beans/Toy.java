package com.xworkz.autowiring.beans;

import org.springframework.stereotype.Component;

@Component
public class Toy {
    
    public Toy() {
        System.out.println("Toy bean created");
    }
}
