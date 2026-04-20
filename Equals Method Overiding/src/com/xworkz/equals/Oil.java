package com.xworkz.equals;
public class Oil {
    String brand;
    String type;
    double liters;

    public Oil(String brand,String type,double liters){
        this.brand=brand;
        this.type=type;
        this.liters=liters;
    }

    public String toString(){
        return brand+" "+type+" "+liters;
    }

    public boolean equals(Object obj){
        if(obj instanceof Oil){
            Oil o=(Oil)obj;
            return brand.equals(o.brand)&&type.equals(o.type)&&liters==o.liters;
        }
        return false;
    }
}