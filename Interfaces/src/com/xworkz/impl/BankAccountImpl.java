package com.xworkz.impl;

import com.xworkz.interfaces.BankAccount;

public class BankAccountImpl implements BankAccount {
    public void deposit() { System.out.println("Deposited"); }
    public void withdraw() { System.out.println("Withdrawn"); }
    public void checkBalance() { System.out.println("Balance checked"); }
}