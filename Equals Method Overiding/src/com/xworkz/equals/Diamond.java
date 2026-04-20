package com.xworkz.equals;
public class Diamond {
    String shape;
    double carat;
    String clarity;

    public Diamond(String shape,double carat,String clarity){
        this.shape=shape;
        this.carat=carat;
        this.clarity=clarity;
    }

    public String toString(){
        return shape+" "+carat+" "+clarity;
    }

    public boolean equals(Object obj){
        if(obj instanceof Diamond){
            Diamond d=(Diamond)obj;
            return shape.equals(d.shape)&&carat==d.carat&&clarity.equals(d.clarity);
        }
        return false;
    }
}