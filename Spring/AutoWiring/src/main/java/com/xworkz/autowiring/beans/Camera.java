package com.xworkz.autowiring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Camera {
    
    private Light light;
    
    public Camera() {
        System.out.println("Camera bean created");
    }
    
    @Autowired
    public void setLight(Light light) {
        System.out.println("now injecting these beans: Light");
        this.light = light;
    }
}
