package com.xworkz.filter.city;

public class CityDto {
    private String name;
    private long pincode;

    public CityDto(String name, long pincode) {
        this.name = name;
        this.pincode = pincode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPincode() {
        return pincode;
    }

    public void setPincode(long pincode) {
        this.pincode = pincode;
    }
    @Override
    public String toString() {
        return "CityDto [name=" + name + ", pincode=" + pincode + "]";
    }

}
