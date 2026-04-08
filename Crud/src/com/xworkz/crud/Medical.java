package com.xworkz.crud;
public class Medical {
    int medicineId;
    String name;
    String manufacturer;
    double price;
    String expiryDate;

    public void displayInfo() {
        System.out.println(medicineId + " " + name + " " + manufacturer + " " + price + " " + expiryDate);
    }
}