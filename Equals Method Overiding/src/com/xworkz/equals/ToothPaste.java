package com.xworkz.equals;
public class ToothPaste {
    String brand;
    String flavor;
    double grams;

    public ToothPaste(String brand,String flavor,double grams){
        this.brand=brand;
        this.flavor=flavor;
        this.grams=grams;
    }

    public String toString(){
        return brand+" "+flavor+" "+grams;
    }

    public boolean equals(Object obj){
        if(obj instanceof ToothPaste){
            ToothPaste t=(ToothPaste)obj;
            return brand.equals(t.brand)&&flavor.equals(t.flavor)&&grams==t.grams;
        }
        return false;
    }
}