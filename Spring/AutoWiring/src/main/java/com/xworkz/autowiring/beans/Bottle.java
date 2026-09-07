package com.xworkz.autowiring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bottle {
    
    private Perfume perfume;
    
    private Paint paint;
    
    private Glue glue;
    
    public Bottle() {
        System.out.println("Bottle bean created");
    }
    
    @Autowired
    public void setPerfume(Perfume perfume) {
        System.out.println("now injecting these beans: Perfume");
        this.perfume = perfume;
    }
    
    @Autowired
    public void setPaint(Paint paint) {
        System.out.println("now injecting these beans: Paint");
        this.paint = paint;
    }
    
    @Autowired
    public void setGlue(Glue glue) {
        System.out.println("now injecting these beans: Glue");
        this.glue = glue;
    }
}
