package com.xworkz.interfaces;

public interface ShoppingCart {
int MAX_ITEMS = 50;
double DISCOUNT = 10.0;

void addItem();
void removeItem();
void checkout();
}