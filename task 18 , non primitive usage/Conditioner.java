class Conditioner {
    String brand,fragrance,ingredients,hairType,usage,price,volume,packaging,phLevel,benefits,
           smoothness,hydration,repair,shine,detangling,organic,shelfLife,expiryDate,texture,nourishment;

    Conditioner(String brand,String fragrance,String ingredients,String hairType,String usage,String price,String volume,String packaging,String phLevel,String benefits,
                String smoothness,String hydration,String repair,String shine,String detangling,String organic,String shelfLife,String expiryDate,String texture,String nourishment){
        this.brand=brand; this.fragrance=fragrance; this.ingredients=ingredients; this.hairType=hairType; this.usage=usage;
        this.price=price; this.volume=volume; this.packaging=packaging; this.phLevel=phLevel; this.benefits=benefits;
        this.smoothness=smoothness; this.hydration=hydration; this.repair=repair;
        this.shine=shine; this.detangling=detangling; this.organic=organic;
        this.shelfLife=shelfLife; this.expiryDate=expiryDate; this.texture=texture; this.nourishment=nourishment;
    }
    void display(){
        System.out.println(brand+" "+fragrance+" "+ingredients+" "+hairType+" "+usage+" "+price+" "+volume+" "+packaging+" "+phLevel+" "+benefits+" "+smoothness+" "+hydration+" "+repair+" "+shine+" "+detangling+" "+organic+" "+shelfLife+" "+expiryDate+" "+texture+" "+nourishment);
    }
}