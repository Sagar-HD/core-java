package com.xworkz.equals;
public class Crown {
    String type;
    String metal;
    double price;

    public Crown(String type,String metal,double price){
        this.type=type;
        this.metal=metal;
        this.price=price;
    }

    public String toString(){
        return type+" "+metal+" "+price;
    }

    public boolean equals(Object obj){
        if(obj instanceof Crown){
            Crown c=(Crown)obj;
            return type.equals(c.type)&&metal.equals(c.metal)&&price==c.price;
        }
        return false;
    }
}