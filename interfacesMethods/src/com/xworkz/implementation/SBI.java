
package com.xworkz.implementation;

import com.xworkz.interfaces.Bank;

public class SBI implements Bank {

    @Override
    public void deposit() {
        System.out.println("Money deposited");
    }

    @Override
    public void withdraw() {
        System.out.println("Money withdrawn");
    }

    public static void main(String[] args) {

        Bank bank = new SBI();

        Bank.staticInfo();
        bank.bankInfo();
        bank.bankDetails();
        bank.deposit();
        bank.withdraw();
    }
}