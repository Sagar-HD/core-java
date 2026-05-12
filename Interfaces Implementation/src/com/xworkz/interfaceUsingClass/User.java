package com.xworkz.interfaceUsingClass;

import com.xworkz.interfaces.Remote;

public class User {
   private Remote remote;
    public void setRemote(Remote remote){
        this.remote=remote;
    }
    public  void checkRemote(){
        remote.turnOn();
        remote.turnOff();
    }
}
