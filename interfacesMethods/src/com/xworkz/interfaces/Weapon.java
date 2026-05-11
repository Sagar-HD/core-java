package com.xworkz.interfaces;

public interface Weapon {
    int damageScore=10;
    String type="weapon";
    String purpose="to destroy";
    void damage();
    public default void getInfo(){
        System.out.println("weapon is there to do damage");

    }
    public default void getWeaponInfo(){
        System.out.println("weapon is there to do damage");
        System.out.println(" my variables are ");
        System.out.println("damage score : "+damageScore);
        System.out.println("type : "+type);
        System.out.println("purpose : "+purpose);
    }
    public  static void getStaticInfo(){
        System.out.println("iam a weapon");
        System.out.println(" my variables are ");
        System.out.println("damage score : "+damageScore);
        System.out.println("type : "+type);
        System.out.println("purpose : "+purpose);
    }
}
