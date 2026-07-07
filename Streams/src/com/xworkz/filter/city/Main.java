package com.xworkz.filter.city;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CityDto> cities = new ArrayList<>();

        cities.add(new CityDto("Sakleshpur", 573134L));
        cities.add(new CityDto("Bengaluru", 560001L));
        cities.add(new CityDto("Mysuru", 570001L));
        cities.add(new CityDto("Mangaluru", 575001L));
        cities.add(new CityDto("Hyderabad", 500001L));
        cities.add(new CityDto("Chennai", 600001L));
        cities.add(new CityDto("Mumbai", 400001L));
        cities.add(new CityDto("Pune", 411001L));
        cities.add(new CityDto("Kolkata", 700001L));
        cities.add(new CityDto("New Delhi", 110001L));

        //a.Filter cities by pincode range: Find all cities with pincodes between 500000-599999
        cities.stream().filter((city)->city.getPincode()>=500000L && city.getPincode()<=599999L).forEach((city)-> System.out.println(city));

        //b.Filter by city name length: Get cities with names longer than 6 characters                \n
        cities.stream().filter((city)->city.getName().length()>6).forEach((city)-> System.out.println(city) );

        //c.Filter by specific digit: Find cities where pincode contains digit '1'                    \n
        cities.stream().filter((city)->Long.toString(city.getPincode()).contains("1")).forEach(System.out::println);

        //d.Filter by even pincodes: Get cities with even pincode numbers                             \n
        cities.stream().filter((city)->city.getPincode()%2==0).forEach(System.out::println);
        //e.Filter by odd pincodes: Get cities with odd pincode numbers                               \n
        cities.stream().filter((city)->city.getPincode()%2!=0).forEach(System.out::println);
        //f.Filter by city starting letter: Find cities starting with 'M' or 'D'                      \n
        cities.stream().filter((city)->city.getName().startsWith("M")||city.getName().startsWith("D")).forEach(System.out::println);
        //g.Filter by pincode divisibility: Get cities where pincode is divisible by 3                \n
        cities.stream().filter((city)->city.getPincode()%3==0).forEach(System.out::println);
        //h.Filter by pincode sum of digits: Find cities where sum of pincode digits > 20             \n
        cities.stream().filter((city)->{
            Long pincode= city.getPincode();
            int sum=0;
            while(pincode>0){
                sum+=pincode%10;
                pincode/=10;
            }
            return sum>20;
        }).forEach(System.out::println);

        //i.Filter by city name containing specific letter: Get cities containing 'a' in name         \n

        cities.stream().filter((city)->city.getName().contains("a")).forEach(System.out::println);

        //j.Filter by pincode ending digit: Find cities with pincode ending in '001'                  \n
        cities.stream().filter((city)->Long.toString(city.getPincode()).endsWith("001")).forEach(System.out::println);

    }
}
