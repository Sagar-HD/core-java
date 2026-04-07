package com.xworkz.guns;

import com.xworkz.bullets.AK47Bullets;

public class AK47 {
AK47Bullets bullets;

    public AK47(AK47Bullets bullets) {
        this.bullets = bullets;
    }
    public void displayInfo(){
        bullets.display();
    }
}
