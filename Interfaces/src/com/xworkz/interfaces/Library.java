package com.xworkz.interfaces;

public interface Library {
    int MAX_BOOKS = 5000;
    int FINE_PER_DAY = 5;

    void issueBook();
    void returnBook();
    void searchBook();
}