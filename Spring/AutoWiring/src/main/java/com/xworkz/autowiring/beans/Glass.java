package com.xworkz.autowiring.beans;

import org.springframework.stereotype.Component;

@Component
public class Glass {
    
    public Glass() {
        System.out.println("Glass bean created");
    }
}
