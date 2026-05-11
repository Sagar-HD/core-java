package com.xworkz.interfaces;

public interface Animal {

    int legs = 4;
    String category = "Wild";
    String food = "Meat";

    void eat();
    void sleep();

    default void animalInfo() {
        System.out.println("Animals are living beings");
    }

    default void animalDetails() {
        System.out.println("Legs: " + legs);
        System.out.println("Category: " + category);
        System.out.println("Food: " + food);
    }

    static void staticInfo() {
        System.out.println("I am Animal Interface");
    }
}