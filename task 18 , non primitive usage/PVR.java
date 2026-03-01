class PVR {
    String location,screenCount,seatingCapacity,ticketPrice,soundSystem,projectionType,snacksAvailable,parking,city,brand,
           technology,openingYear,screenType,rating,popularity,membership,showTimings,cleanliness,service,occupancy;

    PVR(String location,String screenCount,String seatingCapacity,String ticketPrice,String soundSystem,String projectionType,String snacksAvailable,String parking,String city,String brand,
        String technology,String openingYear,String screenType,String rating,String popularity,String membership,String showTimings,String cleanliness,String service,String occupancy){
        this.location=location; this.screenCount=screenCount; this.seatingCapacity=seatingCapacity; this.ticketPrice=ticketPrice;
        this.soundSystem=soundSystem; this.projectionType=projectionType; this.snacksAvailable=snacksAvailable; this.parking=parking;
        this.city=city; this.brand=brand; this.technology=technology; this.openingYear=openingYear;
        this.screenType=screenType; this.rating=rating; this.popularity=popularity;
        this.membership=membership; this.showTimings=showTimings;
        this.cleanliness=cleanliness; this.service=service; this.occupancy=occupancy;
    }
    void display(){
        System.out.println(location+" "+screenCount+" "+seatingCapacity+" "+ticketPrice+" "+soundSystem+" "+projectionType+" "+snacksAvailable+" "+parking+" "+city+" "+brand+" "+technology+" "+openingYear+" "+screenType+" "+rating+" "+popularity+" "+membership+" "+showTimings+" "+cleanliness+" "+service+" "+occupancy);
    }
}