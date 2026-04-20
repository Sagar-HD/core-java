package com.xworkz.equals;
public class Industry {
    String name;
    String sector;
    int employees;

    public Industry(String name,String sector,int employees){
        this.name=name;
        this.sector=sector;
        this.employees=employees;
    }

    public String toString(){
        return name+" "+sector+" "+employees;
    }

    public boolean equals(Object obj){
        if(obj instanceof Industry){
            Industry i=(Industry)obj;
            return name.equals(i.name)&&sector.equals(i.sector)&&employees==i.employees;
        }
        return false;
    }
}