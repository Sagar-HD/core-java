package com.xworkz.country;

public class Country {
    String name;
    President president;
    State[] states;

    public Country(String name, President president, State[] states) {
        this.name = name;
        this.president = president;
        this.states = states;
    }
}
