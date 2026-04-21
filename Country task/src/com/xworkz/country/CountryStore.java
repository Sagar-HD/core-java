package com.xworkz.country;
/*
 save(Country country);\n
 Country findByName(String name)\n
  State findStateByStateName(String name)\n
   City[] findAllCityByStateName(String name)
   int findNoOfDistrictsByCityName(String name)\n
   Country findByCollectorName(String collectorName)\n
Submission Instructions:
 */
public class CountryStore {
    Country[] countries=new Country[10];
    int index=0;

    void save(Country country){
        if(country!=null){
           if(this.countries!=null){
               if(index<this.countries.length){
                   this.countries[this.index]=country;
                   this.index++;
                   System.out.println("Country has been saved");               }
               else{
                   System.out.println("Array is full");
               }
           }
           else{
               System.out.println("Country object is null");
           }
        }
        else{
            System.out.println("Country is null");
        }
    }

   Country getByName(String name) {
       if(this.countries!=null) {
           if(name!=null){
               for(Country country:this.countries){
                   if(country!=null){
                       if(name.equals(country.name)){
                           return country;
                       }
                   }

               }

           }else{
               System.out.println("Country name is null");
           }

       }
       else{
           System.out.println("array is empty");
       }
       System.out.println("Country not present");
     return null;
   }




    State findStateByStateName(String name){
        if(this.countries!=null) {
            if(name!=null) {
                for (Country country : this.countries) {
                    if (country != null) {
                        if (country.states != null) {
                            for (State state : country.states) {
                                if (state != null) {
                                    if (name.equals(state.name)) {
                                        return state;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            else{
                System.out.println("Country name is null");
            }
        }
        else{
            System.out.println("Array is empty");
        }
        System.out.println("state not found");
        return null;

    }
    City[] findAllCityByStateName(String name){
        if(this.countries!=null) {
            if(name!=null){
                State state=findStateByStateName(name);
                if(state!=null){
                    return state.cities;
                }
            }
            else {
                System.out.println("state name is null");
            }
        }
        else{
            System.out.println("Array is empty");
        }
        System.out.println("state not found");
        return null;
    }
    int findNoOfDistrictsByCityName(String name){
        if(this.countries!=null) {
            if (name != null) {

                for (Country country : this.countries) {
                    if (country != null) {
                        if (country.states != null) {
                            for (State state : country.states) {
                                if (state != null) {
                                    if (state.cities != null) {
                                        for (City city : state.cities) {
                                            if (name.equals(city.name)) {
                                                return city.noOfDistricts;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        else{
            System.out.println("Array is empty");
        }
        System.out.println("City not found");
        return -1;

    }

    Country findByCollectorName(String collectorName){
        if(this.countries!=null) {
            if(collectorName!=null) {
                for (Country country : this.countries) {
                    if (country != null) {
                        if (country.states != null) {
                            for (State state : country.states) {
                                if (state != null) {
                                    if (state.cities != null) {
                                        for (City city : state.cities) {
                                            if (city != null) {
                                                if (city.districts != null) {
                                                    for (District district : city.districts) {
                                                        if (district != null) {
                                                            if (district.collector != null) {

                                                                if (collectorName.equals(district.collector.name)) {
                                                                    return country;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            else{
                System.out.println("Collector name is null");
            }
        }
        else{
            System.out.println("Array is empty");
        }
        System.out.println("collector not found");
        return null;
    }

}
