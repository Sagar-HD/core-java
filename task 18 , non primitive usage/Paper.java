class Paper {
    String size,type,thickness,weight,color,brand,usage,texture,recyclable,finish,
           price,sheets,opacity,durability,coating,gsm,origin,packaging,smoothness,pulpType;

    Paper(String size,String type,String thickness,String weight,String color,String brand,String usage,String texture,String recyclable,String finish,
          String price,String sheets,String opacity,String durability,String coating,String gsm,String origin,String packaging,String smoothness,String pulpType){
        this.size=size; this.type=type; this.thickness=thickness; this.weight=weight; this.color=color;
        this.brand=brand; this.usage=usage; this.texture=texture; this.recyclable=recyclable; this.finish=finish;
        this.price=price; this.sheets=sheets; this.opacity=opacity; this.durability=durability; this.coating=coating;
        this.gsm=gsm; this.origin=origin; this.packaging=packaging; this.smoothness=smoothness; this.pulpType=pulpType;
    }
    void display(){
        System.out.println(size+" "+type+" "+thickness+" "+weight+" "+color+" "+brand+" "+usage+" "+texture+" "+recyclable+" "+finish+" "+price+" "+sheets+" "+opacity+" "+durability+" "+coating+" "+gsm+" "+origin+" "+packaging+" "+smoothness+" "+pulpType);
    }
}