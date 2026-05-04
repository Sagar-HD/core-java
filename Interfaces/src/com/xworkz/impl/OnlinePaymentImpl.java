package com.xworkz.impl;

import com.xworkz.interfaces.OnlinePayment;

public class OnlinePaymentImpl implements OnlinePayment {
    public void pay() { System.out.println("Payment done"); }
    public void refund() { System.out.println("Refund processed"); }
    public void checkStatus() { System.out.println("Status checked"); }
}