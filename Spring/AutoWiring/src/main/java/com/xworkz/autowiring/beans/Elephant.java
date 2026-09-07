package com.xworkz.autowiring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Elephant {
    
    private Glue glue;
    
    public Elephant() {
        System.out.println("Elephant bean created");
    }
    
    @Autowired
    public void setGlue(Glue glue) {
        System.out.println("now injecting these beans: Glue");
        this.glue = glue;
    }
}
