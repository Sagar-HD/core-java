package com.xworkz.equals;
public class Wire {
    String material;
    double length;
    String color;

    public Wire(String material, double length, String color) {
        this.material = material;
        this.length = length;
        this.color = color;
    }

    public String toString() {
        return material + " " + length + " " + color;
    }

    public boolean equals(Object obj) {
        if(obj instanceof Wire){
            Wire w = (Wire)obj;
            return material.equals(w.material) && length==w.length && color.equals(w.color);
        }
        return false;
    }
}