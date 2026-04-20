package com.xworkz.equals;
public class Fork {
    String material;
    int prongs;
    String size;

    public Fork(String material,int prongs,String size){
        this.material=material;
        this.prongs=prongs;
        this.size=size;
    }

    public String toString(){
        return material+" "+prongs+" "+size;
    }

    public boolean equals(Object obj){
        if(obj instanceof Fork){
            Fork f=(Fork)obj;
            return material.equals(f.material)&&prongs==f.prongs&&size.equals(f.size);
        }
        return false;
    }
}