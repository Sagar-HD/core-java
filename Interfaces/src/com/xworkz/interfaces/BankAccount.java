package com.xworkz.interfaces;

public interface BankAccount {
    double MIN_BALANCE = 1000;
    double INTEREST_RATE = 5.5;

    void deposit();
    void withdraw();
    void checkBalance();
}