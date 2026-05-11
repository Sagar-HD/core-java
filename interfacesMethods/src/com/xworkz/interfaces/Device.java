
package com.xworkz.interfaces;

public interface Device {

    int price = 50000;
    String brand = "Samsung";
    String category = "Electronics";

    void switchOn();
    void switchOff();

    default void deviceInfo() {
        System.out.println("Devices make work easy");
    }

    default void deviceDetails() {
        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Category: " + category);
    }

    static void staticInfo() {
        System.out.println("I am Device Interface");
    }
}