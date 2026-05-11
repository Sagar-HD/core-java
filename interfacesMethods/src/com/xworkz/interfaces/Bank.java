
package com.xworkz.interfaces;

public interface Bank {

    int interest = 7;
    String bankName = "SBI";
    String location = "Bangalore";

    void deposit();
    void withdraw();

    default void bankInfo() {
        System.out.println("Banks manage money");
    }

    default void bankDetails() {
        System.out.println("Interest: " + interest);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Location: " + location);
    }

    static void staticInfo() {
        System.out.println("I am Bank Interface");
    }
}