package com.xworkz.country;

public class City {
    String name;
    int noOfDistricts;
    District[] districts;
    public City(String name, int noOfDistricts, District[] districts) {
        this.name = name;
        this.noOfDistricts = noOfDistricts;
    }
}
