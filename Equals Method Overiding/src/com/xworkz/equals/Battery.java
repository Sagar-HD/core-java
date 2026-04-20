package com.xworkz.equals;
public class Battery {
    String brand;
    int mah;
    String type;

    public Battery(String brand,int mah,String type){
        this.brand=brand;
        this.mah=mah;
        this.type=type;
    }

    public String toString(){
        return brand+" "+mah+" "+type;
    }

    public boolean equals(Object obj){
        if(obj instanceof Battery){
            Battery b=(Battery)obj;
            return brand.equals(b.brand)&&mah==b.mah&&type.equals(b.type);
        }
        return false;
    }
}