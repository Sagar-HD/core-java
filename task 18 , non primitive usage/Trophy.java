class Trophy {
    String material,height,weight,design,engraving,baseType,color,finish,category,eventName,
           year,sponsor,brand,cost,shape,size,durability,style,presentationBox,prizeLevel;

    Trophy(String material,String height,String weight,String design,String engraving,String baseType,String color,String finish,String category,String eventName,
           String year,String sponsor,String brand,String cost,String shape,String size,String durability,String style,String presentationBox,String prizeLevel){
        this.material=material; this.height=height; this.weight=weight; this.design=design; this.engraving=engraving;
        this.baseType=baseType; this.color=color; this.finish=finish; this.category=category; this.eventName=eventName;
        this.year=year; this.sponsor=sponsor; this.brand=brand; this.cost=cost;
        this.shape=shape; this.size=size; this.durability=durability;
        this.style=style; this.presentationBox=presentationBox; this.prizeLevel=prizeLevel;
    }
    void display(){
        System.out.println(material+" "+height+" "+weight+" "+design+" "+engraving+" "+baseType+" "+color+" "+finish+" "+category+" "+eventName+" "+year+" "+sponsor+" "+brand+" "+cost+" "+shape+" "+size+" "+durability+" "+style+" "+presentationBox+" "+prizeLevel);
    }
}