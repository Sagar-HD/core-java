package com.xworkz.autowiring.beans;

import org.springframework.stereotype.Component;

@Component
public class Glue {
    
    public Glue() {
        System.out.println("Glue bean created");
    }
}
