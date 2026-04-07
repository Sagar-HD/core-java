package com.xworkz.app;

import com.xworkz.bullets.AK47Bullets;
import com.xworkz.guns.AK47;

public class App {
    public static void main(String[] args) {
        AK47Bullets bullets=new AK47Bullets(2,8);
        AK47 ak47=new AK47(bullets);
        ak47.displayInfo();
    }
}
