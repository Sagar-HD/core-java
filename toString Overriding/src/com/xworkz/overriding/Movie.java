package com.xworkz.overriding;

public class Movie {
    Actor[] actors;

String name;

    public Movie(Actor[] actors,  String name) {
        this.actors = actors;


        this.name = name;

    }
    public void play(){
        System.out.println("Movie is playing in movie class");
    }
    public void stop(){
        System.out.println("Movie is stoping in movie class");
    }

    @Override
    public String toString() {
        return this.name;
    }
}
