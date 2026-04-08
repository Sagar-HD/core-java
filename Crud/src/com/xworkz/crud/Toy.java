package com.xworkz.crud;
public class Toy {
    int id;
    String name;
    String brand;
    double price;
    int ageGroup;

    public void displayInfo() {
        System.out.println(id + " " + name + " " + brand + " " + price + " " + ageGroup);
    }
}