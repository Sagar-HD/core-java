package com.xworkz.autowiring.beans;

import org.springframework.stereotype.Component;

@Component
public class Ganesha {
    
    public Ganesha() {
        System.out.println("Ganesha bean created");
    }
}
