package com.xworkz.crud;
public class PanCard {
    String panNumber;
    String holderName;
    int age;
    String address;
    String dob;

   public void displayInfo() {
        System.out.println(panNumber + " " + holderName + " " + age + " " + address + " " + dob);
    }
}