package com.xworkz.interfaceUsingClass;

import com.xworkz.interfaces.SuperMarket;

public class Mall {
    private SuperMarket superMarket;
    public Mall(SuperMarket superMarket){
        this.superMarket=superMarket;
    }
    public void buyInSuperMarket(){
        System.out.println("buying in mall's supermarket");
        this.superMarket.discount();
        this.superMarket.purchase();
    }
}
