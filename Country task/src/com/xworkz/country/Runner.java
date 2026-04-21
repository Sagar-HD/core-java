package com.xworkz.country;

public class Runner {
    public static void main(String[] args) {

        CountryStore store = new CountryStore();

        Collector collector1 = new Collector(101,"Ramesh");
        District district1 = new District("Bangalore Urban",collector1);
        District[] districts1 = {district1};
        City city1 = new City("Bangalore",1,districts1);
        City[] cities1 = {city1};
        State state1 = new State("Karnataka",70000000,cities1);
        State[] states1 = {state1};
        Address address1 = new Address(101,560001,state1);
        President president1 = new President(address1,65,"Droupadi Murmu");
        Country country1 = new Country("India",president1,states1);

        Collector collector2 = new Collector(102,"Tanaka");
        District district2 = new District("Central District",collector2);
        District[] districts2 = {district2};
        City city2 = new City("Tokyo City",1,districts2);
        City[] cities2 = {city2};
        State state2 = new State("Tokyo",14000000,cities2);
        State[] states2 = {state2};
        Address address2 = new Address(103,100001,state2);
        President president2 = new President(address2,67,"Fumio Kishida");
        Country country2 = new Country("Japan",president2,states2);

        Collector collector3 = new Collector(103,"Hans");
        District district3 = new District("Munich District",collector3);
        District[] districts3 = {district3};
        City city3 = new City("Munich",1,districts3);
        City[] cities3 = {city3};
        State state3 = new State("Bavaria",13000000,cities3);
        State[] states3 = {state3};
        Address address3 = new Address(103,200001,state3);
        President president3 = new President(address3,68,"Frank Steinmeier");
        Country country3 = new Country("Germany",president3,states3);

        Collector collector4 = new Collector(104,"John");
        District district4 = new District("Toronto District",collector4);
        District[] districts4 = {district4};
        City city4 = new City("Toronto",1,districts4);
        City[] cities4 = {city4};
        State state4 = new State("Ontario",15000000,cities4);
        State[] states4 = {state4};
        Address address4 = new Address(104,300001,state4);
        President president4 = new President(address4,76,"Mary Simon");
        Country country4 = new Country("Canada",president4,states4);

        store.save(country1);
        store.save(country2);
        store.save(country3);
        store.save(country4);
        System.out.println(store.getByName("Canada"));
        System.out.println(store.findStateByStateName("Ontario"));
        System.out.println(store.findStateByStateName("karnataka"));
        City[] citiesFound=store.findAllCityByStateName("Ontario");
        for(City city:citiesFound){
            System.out.println(city);
        }
        System.out.println(store.findNoOfDistrictsByCityName("Tokyo City"));
        System.out.println(store.findNoOfDistrictsByCityName("Sakleshpura"));
        System.out.println(store.findByCollectorName("Tanaka"));
        System.out.println(store.findByCollectorName("Sagar"));
    }
}
