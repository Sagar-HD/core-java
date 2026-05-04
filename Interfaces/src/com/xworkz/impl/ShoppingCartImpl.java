package com.xworkz.impl;

import com.xworkz.interfaces.ShoppingCart;

public class ShoppingCartImpl implements ShoppingCart {
    public void addItem() { System.out.println("Item added"); }
    public void removeItem() { System.out.println("Item removed"); }
    public void checkout() { System.out.println("Checkout done"); }
}