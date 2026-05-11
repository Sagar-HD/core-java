
package com.xworkz.implementation;

import com.xworkz.interfaces.Food;

public class Biryani implements Food {

    @Override
    public void prepare() {
        System.out.println("Biryani is preparing");
    }

    @Override
    public void serve() {
        System.out.println("Biryani served");
    }

    public static void main(String[] args) {

        Food food = new Biryani();

        Food.staticInfo();
        food.foodInfo();
        food.foodDetails();
        food.prepare();
        food.serve();
    }
}