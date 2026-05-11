package com.xworkz.implementation;

import com.xworkz.interfaces.Tool;
import com.xworkz.interfaces.Weapon;

public class Pistol implements Tool, Weapon {
    @Override
    public void connect() {

    }

    @Override
    public void damage() {
        System.out.println("I'm doing damage");
    }

    @Override
    public void getWeaponInfo() {
        System.out.println("weapon info is over-rided");
    }

    public static void main(String[] args) {
        Weapon weapon=new Pistol();
        Weapon.getStaticInfo();
        weapon.getInfo();
        weapon.getWeaponInfo();
        weapon.damage();
    }

}
