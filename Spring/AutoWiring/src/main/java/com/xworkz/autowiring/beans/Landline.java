package com.xworkz.autowiring.beans;

import org.springframework.stereotype.Component;

@Component
public class Landline {
    
    public Landline() {
        System.out.println("Landline bean created");
    }
}
