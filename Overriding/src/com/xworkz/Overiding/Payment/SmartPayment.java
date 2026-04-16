package com.xworkz.Overiding.Payment;

public class SmartPayment extends OldPayment {
    @Override
    public void pay() {
        System.out.println("Pay using scan or card");
    }
}