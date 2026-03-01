class Garlic {
    String variety,origin,size,flavor,aroma,nutrients,color,cloves,freshness,harvestDate,
           storageType,shelfLife,organic,price,packaging,weight,region,usage,dryingMethod,medicinalUse;

    Garlic(String variety,String origin,String size,String flavor,String aroma,String nutrients,String color,String cloves,String freshness,String harvestDate,
           String storageType,String shelfLife,String organic,String price,String packaging,String weight,String region,String usage,String dryingMethod,String medicinalUse){
        this.variety=variety; this.origin=origin; this.size=size; this.flavor=flavor; this.aroma=aroma;
        this.nutrients=nutrients; this.color=color; this.cloves=cloves; this.freshness=freshness; this.harvestDate=harvestDate;
        this.storageType=storageType; this.shelfLife=shelfLife; this.organic=organic; this.price=price;
        this.packaging=packaging; this.weight=weight; this.region=region; this.usage=usage;
        this.dryingMethod=dryingMethod; this.medicinalUse=medicinalUse;
    }
    void display(){
        System.out.println(variety+" "+origin+" "+size+" "+flavor+" "+aroma+" "+nutrients+" "+color+" "+cloves+" "+freshness+" "+harvestDate+" "+storageType+" "+shelfLife+" "+organic+" "+price+" "+packaging+" "+weight+" "+region+" "+usage+" "+dryingMethod+" "+medicinalUse);
    }
}