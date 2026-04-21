package com.xworkz.country;

public class State {
    String name;
    int population;
    City[] cities;
    public State(String name, int population, City[] cities) {
        this.name = name;
        this.population = population;
        this.cities = cities;
    }
}
