package com.xworkz.equals;
public class Trolley {
    String brand;
    int wheels;
    double capacity;

    public Trolley(String brand,int wheels,double capacity){
        this.brand=brand;
        this.wheels=wheels;
        this.capacity=capacity;
    }

    public String toString(){
        return brand+" "+wheels+" "+capacity;
    }

    public boolean equals(Object obj){
        if(obj instanceof Trolley){
            Trolley t=(Trolley)obj;
            return brand.equals(t.brand)&&wheels==t.wheels&&capacity==t.capacity;
        }
        return false;
    }
}