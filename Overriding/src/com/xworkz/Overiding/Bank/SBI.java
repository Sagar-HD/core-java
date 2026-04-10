package com.xworkz.Overiding.Bank;

public class SBI extends Bank {
    @Override
    public double getInterestRate() {
        return 5.0;
    }
}