class Shampoo {
    String brand,fragrance,ingredients,hairType,usage,price,volume,packaging,phLevel,benefits,
           color,texture,shelfLife,organic,antiDandruff,moisturizing,repair,shine,usageFrequency,expiryDate;

    Shampoo(String brand,String fragrance,String ingredients,String hairType,String usage,String price,String volume,String packaging,String phLevel,String benefits,
            String color,String texture,String shelfLife,String organic,String antiDandruff,String moisturizing,String repair,String shine,String usageFrequency,String expiryDate){
        this.brand=brand; this.fragrance=fragrance; this.ingredients=ingredients; this.hairType=hairType; this.usage=usage;
        this.price=price; this.volume=volume; this.packaging=packaging; this.phLevel=phLevel; this.benefits=benefits;
        this.color=color; this.texture=texture; this.shelfLife=shelfLife; this.organic=organic;
        this.antiDandruff=antiDandruff; this.moisturizing=moisturizing; this.repair=repair;
        this.shine=shine; this.usageFrequency=usageFrequency; this.expiryDate=expiryDate;
    }
    void display(){
        System.out.println(brand+" "+fragrance+" "+ingredients+" "+hairType+" "+usage+" "+price+" "+volume+" "+packaging+" "+phLevel+" "+benefits+" "+color+" "+texture+" "+shelfLife+" "+organic+" "+antiDandruff+" "+moisturizing+" "+repair+" "+shine+" "+usageFrequency+" "+expiryDate);
    }
}