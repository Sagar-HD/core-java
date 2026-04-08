package com.xworkz.crud;
public class Shop {
    int shopId;
    String shopName;
    String location;
    String owner;
    double revenue;

   public void displayInfo() {
        System.out.println(shopId + " " + shopName + " " + location + " " + owner + " " + revenue);
    }
}