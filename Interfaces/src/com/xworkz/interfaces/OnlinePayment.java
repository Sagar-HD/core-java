package com.xworkz.interfaces;

public interface OnlinePayment {
    double LIMIT = 50000;
    int TRANSACTION_FEE = 2;

    void pay();
    void refund();
    void checkStatus();
}