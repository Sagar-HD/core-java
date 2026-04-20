package com.xworkz.equals;
public class WaterMelon {
    String origin;
    double weight;
    String taste;

    public WaterMelon(String origin,double weight,String taste){
        this.origin=origin;
        this.weight=weight;
        this.taste=taste;
    }

    public String toString(){
        return origin+" "+weight+" "+taste;
    }

    public boolean equals(Object obj){
        if(obj instanceof WaterMelon){
            WaterMelon w=(WaterMelon)obj;
            return origin.equals(w.origin)&&weight==w.weight&&taste.equals(w.taste);
        }
        return false;
    }
}