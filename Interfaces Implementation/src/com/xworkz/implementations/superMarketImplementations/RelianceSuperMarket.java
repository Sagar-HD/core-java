package com.xworkz.implementations.superMarketImplementations;

import com.xworkz.interfaces.SuperMarket;

public class RelianceSuperMarket implements SuperMarket {
    @Override
    public void purchase() {
        System.out.println("purchasing in reliance super market");
    }

    @Override
    public void discount() {
        System.out.println("discount applied in reliance super market of "+SuperMarket.discont);
    }
}
