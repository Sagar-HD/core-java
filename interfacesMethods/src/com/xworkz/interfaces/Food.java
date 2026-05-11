
package com.xworkz.interfaces;

public interface Food {

    int calories = 200;
    String taste = "Spicy";
    String origin = "India";

    void prepare();
    void serve();

    default void foodInfo() {
        System.out.println("Food gives energy");
    }

    default void foodDetails() {
        System.out.println("Calories: " + calories);
        System.out.println("Taste: " + taste);
        System.out.println("Origin: " + origin);
    }

    static void staticInfo() {
        System.out.println("I am Food Interface");
    }
}