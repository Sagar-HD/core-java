package com.xworkz.country;

/*Declare below class Country Country: name,President,
 State[] President name,age,Address Address: no,pincode,State State : name,population,City[] City: name,
 noOfDistricts,District[] District: name,Collector Collector: name,batchNo \n CountryStore : Country[10]
 save(Country country);\n Country findByName(String name)\n State findStateByStateName(String name)\n City[]
  findAllCityByStateName(String name) int findNoOfDistrictsByCityName(String name)\n
  Country findByCollectorName(String collectorName)\n
*/

import java.util.Objects;

public class Collector {
    String name;
    int batchNo;

    public Collector(int batchNo, String name) {
        this.batchNo = batchNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Collector{" +
                "batchNo=" + batchNo +
                ", name='" + name + '\'' +
                '}';
    }





}
