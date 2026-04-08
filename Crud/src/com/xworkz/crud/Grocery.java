package com.xworkz.crud;
public class Grocery {
    int itemId;
    String itemName;
    double price;
    int quantity;
    String category;

   public void displayInfo() {
        System.out.println(itemId + " " + itemName + " " + price + " " + quantity + " " + category);
    }
}