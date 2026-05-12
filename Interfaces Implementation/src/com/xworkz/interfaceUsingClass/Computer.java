package com.xworkz.interfaceUsingClass;

import com.xworkz.interfaces.OperatingSystem;

public class Computer {
    OperatingSystem os;
    public  Computer(OperatingSystem os){
        this.os=os;
    }
    public void check(){
        os.boot();
        os.start();
        os.stop();
    }
}
