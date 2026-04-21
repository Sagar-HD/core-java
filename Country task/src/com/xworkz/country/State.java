package com.xworkz.country;

import java.util.Arrays;

public class State {
    String name;
    int population;
    City[] cities;
    public State(String name, int population, City[] cities) {
        this.name = name;
        this.population = population;
        this.cities = cities;
    }

    @Override
    public String toString() {
        return "State{" +
                "cities=" + Arrays.toString(cities) +
                ", name='" + name + '\'' +
                ", population=" + population +
                '}';
    }
}
