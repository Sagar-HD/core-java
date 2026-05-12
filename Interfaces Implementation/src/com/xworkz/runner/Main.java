package com.xworkz.runner;

import com.xworkz.implementations.operatingSystemImplementations.MacOperatingSystem;
import com.xworkz.implementations.operatingSystemImplementations.WindowsOperatingSystem;
import com.xworkz.implementations.remoteImplementations.HatwayRemote;
import com.xworkz.implementations.remoteImplementations.TataRemote;
import com.xworkz.implementations.superMarketImplementations.DmartSuperMarket;
import com.xworkz.implementations.superMarketImplementations.RelianceSuperMarket;
import com.xworkz.interfaceUsingClass.Computer;
import com.xworkz.interfaceUsingClass.Mall;
import com.xworkz.interfaceUsingClass.User;
import com.xworkz.interfaces.OperatingSystem;
import com.xworkz.interfaces.Remote;
import com.xworkz.interfaces.SuperMarket;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        SuperMarket superMarket=new DmartSuperMarket();
        Mall mall=new Mall(superMarket);
        mall.buyInSuperMarket();
         superMarket=new RelianceSuperMarket();
        Mall mall2=new Mall(superMarket);
        mall2.buyInSuperMarket();
        System.out.println("///////////////////////////");
        OperatingSystem os=new WindowsOperatingSystem();
        Computer computer=new Computer(os);
        computer.check();
        os=new MacOperatingSystem();
        Computer computer1=new Computer(os);
        computer1.check();
        System.out.println("///////////////////////////");
        Remote remote=new TataRemote();
        User user=new User();
        user.setRemote(remote);
        user.checkRemote();
        remote=new HatwayRemote();
        user.setRemote(remote);
        user.checkRemote();
        };

    }

