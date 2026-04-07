package com.xworkz.bullets;

public class AK47Bullets {
   int width;
   int height;

    public AK47Bullets(int height, int width) {
        this.height = height;
        this.width = width;
    }
    public  void display(){
        System.out.println("AK47 Bullets");
        System.out.println("height: " + height);
        System.out.println("width: " + width);
    }

}
