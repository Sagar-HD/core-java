class Pepper {
    String type,color,taste,origin,size,spiceLevel,nutrients,usage,shelfLife,price,
           packaging,weight,aroma,brand,harvestSeason,freshness,dryingMethod,storageType,region,organic;

    Pepper(String type,String color,String taste,String origin,String size,String spiceLevel,String nutrients,String usage,String shelfLife,String price,
           String packaging,String weight,String aroma,String brand,String harvestSeason,String freshness,String dryingMethod,String storageType,String region,String organic){
        this.type=type; this.color=color; this.taste=taste; this.origin=origin; this.size=size; this.spiceLevel=spiceLevel;
        this.nutrients=nutrients; this.usage=usage; this.shelfLife=shelfLife; this.price=price; this.packaging=packaging;
        this.weight=weight; this.aroma=aroma; this.brand=brand; this.harvestSeason=harvestSeason; this.freshness=freshness;
        this.dryingMethod=dryingMethod; this.storageType=storageType; this.region=region; this.organic=organic;
    }
    void display(){
        System.out.println(type+" "+color+" "+taste+" "+origin+" "+size+" "+spiceLevel+" "+nutrients+" "+usage+" "+shelfLife+" "+price+" "+packaging+" "+weight+" "+aroma+" "+brand+" "+harvestSeason+" "+freshness+" "+dryingMethod+" "+storageType+" "+region+" "+organic);
    }
}