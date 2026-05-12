package com.xworkz.implementations.superMarketImplementations;

import com.xworkz.interfaces.SuperMarket;

public class DmartSuperMarket implements SuperMarket {
    @Override
    public void purchase() {
        System.out.println("purchasing in dmart super market");
    }

    @Override
    public void discount() {
        System.out.println("discount in dmart of "+SuperMarket.discont);
    }
}
