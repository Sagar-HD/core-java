class Lotion {
    String brand,fragrance,ingredients,skinType,usage,price,volume,packaging,moisturizing,texture,
           shelfLife,organic,spf,hydration,smoothness,absorption,expiryDate,benefits,color,protection;

    Lotion(String brand,String fragrance,String ingredients,String skinType,String usage,String price,String volume,String packaging,String moisturizing,String texture,
           String shelfLife,String organic,String spf,String hydration,String smoothness,String absorption,String expiryDate,String benefits,String color,String protection){
        this.brand=brand; this.fragrance=fragrance; this.ingredients=ingredients; this.skinType=skinType;
        this.usage=usage; this.price=price; this.volume=volume; this.packaging=packaging;
        this.moisturizing=moisturizing; this.texture=texture; this.shelfLife=shelfLife;
        this.organic=organic; this.spf=spf; this.hydration=hydration;
        this.smoothness=smoothness; this.absorption=absorption;
        this.expiryDate=expiryDate; this.benefits=benefits;
        this.color=color; this.protection=protection;
    }
    void display(){
        System.out.println(brand+" "+fragrance+" "+ingredients+" "+skinType+" "+usage+" "+price+" "+volume+" "+packaging+" "+moisturizing+" "+texture+" "+shelfLife+" "+organic+" "+spf+" "+hydration+" "+smoothness+" "+absorption+" "+expiryDate+" "+benefits+" "+color+" "+protection);
    }
}