package com.xworkz.equals;
public class Sim {
    String provider;
    String type;
    long number;

    public Sim(String provider,String type,long number){
        this.provider=provider;
        this.type=type;
        this.number=number;
    }

    public String toString(){
        return provider+" "+type+" "+number;
    }

    public boolean equals(Object obj){
        if(obj instanceof Sim){
            Sim s=(Sim)obj;
            return provider.equals(s.provider)&&type.equals(s.type)&&number==s.number;
        }
        return false;
    }
}