package com.xworkz.Overiding.Runner;

import com.xworkz.Overiding.Vehicle.Vehicle;
import com.xworkz.Overiding.Vehicle.Car;

import com.xworkz.Overiding.Bike.Bike;
import com.xworkz.Overiding.Bike.Rx100;

import com.xworkz.Overiding.Bank.Bank;
import com.xworkz.Overiding.Bank.SBI;

import com.xworkz.Overiding.Payment.OldPayment;
import com.xworkz.Overiding.Payment.SmartPayment;

import com.xworkz.Overiding.Mobile.Mobile;
import com.xworkz.Overiding.Mobile.Smartphone;

public class Runner {

    public static void main(String[] args) {

        Vehicle v = new Car();
        v.drive();

        Bike b = new Rx100();
        b.ride();

        Bank bank = new SBI();
        System.out.println(bank.getInterestRate());

        OldPayment p = new SmartPayment();
        p.pay();

        Mobile m = new Smartphone();
        m.unlock();
    }
}