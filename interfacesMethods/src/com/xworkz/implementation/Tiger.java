package com.xworkz.implementation;

import com.xworkz.interfaces.Animal;

public class Tiger implements Animal {

    @Override
    public void eat() {
        System.out.println("Tiger eats meat");
    }

    @Override
    public void sleep() {
        System.out.println("Tiger sleeps");
    }

    public static void main(String[] args) {

        Animal animal = new Tiger();

        Animal.staticInfo();
        animal.animalInfo();
        animal.animalDetails();
        animal.eat();
        animal.sleep();
    }
}
