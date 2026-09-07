package com.xworkz.autowiring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Box {
    
    private Paint paint;
    
    public Box() {
        System.out.println("Box bean created");
    }
    
    @Autowired
    public void setPaint(Paint paint) {
        System.out.println("now injecting these beans: Paint");
        this.paint = paint;
    }
}
