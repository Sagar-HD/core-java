package com.xworkz.filter.war;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<WarDto> wars = new ArrayList<>();

        wars.add(new WarDto(
                "World War I",
                LocalDate.of(1914, 7, 28),
                LocalDate.of(1918, 11, 11),
                "Europe",
                Arrays.asList("Germany", "France", "United Kingdom", "Russia"),
                17000000,
                "Victory",
                1567,
                "Douglas Haig",
                "Alliance conflict"
        ));

        wars.add(new WarDto(
                "World War II",
                LocalDate.of(1939, 9, 1),
                LocalDate.of(1945, 9, 2),
                "Europe",
                Arrays.asList("Germany", "United Kingdom", "USA", "Japan", "USSR"),
                70000000,
                "Victory",
                2194,
                "Dwight Eisenhower",
                "Expansionism"
        ));

        wars.add(new WarDto(
                "Kargil War",
                LocalDate.of(1999, 5, 3),
                LocalDate.of(1999, 7, 26),
                "India",
                Arrays.asList("India", "Pakistan"),
                1300,
                "Victory",
                85,
                "Ved Prakash Malik",
                "Territorial dispute"
        ));

        wars.add(new WarDto(
                "Napoleonic Wars",
                LocalDate.of(1803, 5, 18),
                LocalDate.of(1815, 11, 20),
                "Europe",
                Arrays.asList("France", "United Kingdom", "Austria", "Russia"),
                3500000,
                "Defeat",
                4569,
                "Napoleon",
                "Expansionism"
        ));

        wars.add(new WarDto(
                "American Civil War",
                LocalDate.of(1861, 4, 12),
                LocalDate.of(1865, 5, 26),
                "North America",
                Arrays.asList("USA"),
                620000,
                "Victory",
                1505,
                "Ulysses Grant",
                "Civil conflict"
        ));

        wars.add(new WarDto(
                "Crimean War",
                LocalDate.of(1853, 10, 16),
                LocalDate.of(1856, 3, 30),
                "Europe",
                Arrays.asList("Russia", "France", "United Kingdom", "Ottoman Empire"),
                750000,
                "Victory",
                897,
                "Lord Raglan",
                "Territorial dispute"
        ));

        wars.add(new WarDto(
                "Indo-China War",
                LocalDate.of(1962, 10, 20),
                LocalDate.of(1962, 11, 21),
                "Asia",
                Arrays.asList("India", "China"),
                5000,
                "Defeat",
                32,
                "B. M. Kaul",
                "Border dispute"
        ));

        wars.add(new WarDto(
                "Winter War",
                LocalDate.of(1939, 11, 30),
                LocalDate.of(1940, 3, 13),
                "Europe",
                Arrays.asList("Finland", "USSR"),
                150000,
                "Victory",
                105,
                "Carl Mannerheim",
                "Territorial dispute"
        ));

        wars.add(new WarDto(
                "Gulf War",
                LocalDate.of(1990, 8, 2),
                LocalDate.of(1991, 2, 28),
                "Middle East",
                Arrays.asList("Iraq", "USA", "Kuwait"),
                50000,
                "Victory",
                210,
                "Norman Schwarzkopf",
                "Invasion"
        ));

        wars.add(new WarDto(
                "Waterloo Campaign",
                LocalDate.of(1815, 6, 15),
                LocalDate.of(1815, 7, 8),
                "Europe",
                Arrays.asList("France", "United Kingdom", "Prussia"),
                65000,
                "Defeat",
                23,
                "Napoleon",
                "Power struggle"
        ));


       // Filter wars by name starting with a specific letter (e.g., 'W')                                                 \n
      wars.stream().filter((war)->war.getWarName().startsWith("W")).forEach(System.out::println);

      //  Filter wars by location (e.g., wars fought in "Europe")                                                         \n
      wars.stream().filter((war)->war.getLocation().equals("Europe")).forEach(System.out::println);

        //  Filter wars by outcome (e.g., wars with outcome "Victory")                                                      \n
   wars.stream().filter((war)->war.getOutcome().equals("Victory")).forEach(System.out::println);
    //    Filter wars by commander name (e.g., wars led by "Napoleon")                                                    \n
    wars.stream().filter((war)->war.getCommander().equals("Napoleon")).forEach(System.out::println);
      //  Filter wars by reason (e.g., wars caused by "Territorial dispute")                                              \n
      wars.stream().filter((war)->war.getReason().equals("Territorial dispute")).forEach(System.out::println);
       // Date-Based Filtering                                                                                            \n
       wars.stream().filter((war)->war.getStartDate().isBefore(LocalDate.of(1900, 1, 1))).forEach(System.out::println);
        // Filter wars that started after a specific date (e.g., after 1900)                                               \n
        wars.stream().filter((war)->war.getEndDate().isAfter(LocalDate.of(1900, 1, 1))).forEach(System.out::println);
        //Filter wars that ended before a specific date (e.g., before 1800)                                               \n
        wars.stream().filter((war)->war.getEndDate().isBefore(LocalDate.of(1800, 1, 1))).forEach(System.out::println);
        //Filter wars that occurred in a specific century (e.g., 20th century)                                            \n
        wars.stream().filter((war)->war.getStartDate().isBefore(LocalDate.of(2000, 1, 1))).forEach(System.out::println);
        //Filter wars with duration greater than X days (e.g., > 365 days)                                                \n
        wars.stream().filter((war)->war.getDurationDays()>365).forEach(System.out::println);
        //Filter wars with duration less than X days (e.g., < 30 days)                                                    \n
        wars.stream().filter((war)->war.getDurationDays()<30).forEach(System.out::println);
        //Numerical Filtering                                                                                             \n

        //Filter wars with casualties greater than a threshold (e.g., > 100,000)                                          \n
        wars.stream().filter((war)->war.getCasualties()>100000).forEach(System.out::println);
        //Filter wars with casualties less than a threshold (e.g., < 10,000)                                              \n
        wars.stream().filter((war)->war.getCasualties()<10000).forEach(System.out::println);
        //Filter wars with casualties in a specific range (e.g., 50,000-500,000)                                          \n
        wars.stream().filter((war)->war.getCasualties()>=50000 && war.getCasualties()<=500000).forEach(System.out::println);
        //Filter wars with duration divisible by a number (e.g., duration % 7 == 0)                                       \n
      wars.stream().filter((war)->war.getDurationDays()%7==0).forEach(System.out::println);
        //Collection-Based Filtering                                                                                      \n

        //Filter wars involving specific countries (e.g., wars involving "India")                                         \n
        wars.stream().filter((war)->war.getCountriesInvolved().contains("India")).forEach(System.out::println);



    }

}
