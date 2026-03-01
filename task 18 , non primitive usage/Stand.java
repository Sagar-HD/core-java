class Stand {
    String material,height,width,color,brand,usage,weightCapacity,stability,design,foldable,
           adjustable,price,durability,portability,finish,shape,baseType,installationType,surface,style;

    Stand(String material,String height,String width,String color,String brand,String usage,String weightCapacity,String stability,String design,String foldable,
          String adjustable,String price,String durability,String portability,String finish,String shape,String baseType,String installationType,String surface,String style){
        this.material=material; this.height=height; this.width=width; this.color=color; this.brand=brand;
        this.usage=usage; this.weightCapacity=weightCapacity; this.stability=stability; this.design=design; this.foldable=foldable;
        this.adjustable=adjustable; this.price=price; this.durability=durability; this.portability=portability;
        this.finish=finish; this.shape=shape; this.baseType=baseType; this.installationType=installationType;
        this.surface=surface; this.style=style;
    }
    void display(){
        System.out.println(material+" "+height+" "+width+" "+color+" "+brand+" "+usage+" "+weightCapacity+" "+stability+" "+design+" "+foldable+" "+adjustable+" "+price+" "+durability+" "+portability+" "+finish+" "+shape+" "+baseType+" "+installationType+" "+surface+" "+style);
    }
}