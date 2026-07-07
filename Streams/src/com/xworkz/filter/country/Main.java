package com.xworkz.filter.country;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> countries=new ArrayList<>();
        countries.add("india");
        countries.add("america");
        countries.add("pakisthan");
        countries.add("south africa");

        //filter countires start with i
        countries.stream().filter((country)->country.toLowerCase().startsWith("i")).forEach((country)-> System.out.println(country));
        //filter countries start with a
        countries.stream().filter((country)->country.toLowerCase().startsWith("a")).forEach((country)-> System.out.println(country));
        //filter countries with 2 or more words
        countries.stream().filter((country)->country.split(" ").length>=2).forEach((country)-> System.out.println(country));
        //filter countries length more than 10
        countries.stream().filter((country)->country.length()>=10).forEach((country)-> System.out.println(country));
        //filter countries length less than equal to 5
        countries.stream().filter((country)->country.length()<=5).forEach((country)-> System.out.println(country));
        //print all countries
        countries.forEach((country)-> System.out.println(country));


    }
}
