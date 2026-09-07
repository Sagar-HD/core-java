package com.xworkz.autowiring.beans;

import org.springframework.stereotype.Component;

@Component
public class Paint {
    
    public Paint() {
        System.out.println("Paint bean created");
    }
}
