class WallPaper {
    String color, texture, material, design, brand,
           size, pattern, thickness, durability, finish,
           washable, installationType, roomType, price,
           style, ecoFriendly, moistureResistant, peelable,
           removable, adhesiveType;

    WallPaper(String color,String texture,String material,String design,String brand,
              String size,String pattern,String thickness,String durability,String finish,
              String washable,String installationType,String roomType,String price,
              String style,String ecoFriendly,String moistureResistant,String peelable,
              String removable,String adhesiveType){
        this.color=color; this.texture=texture; this.material=material; this.design=design; this.brand=brand;
        this.size=size; this.pattern=pattern; this.thickness=thickness; this.durability=durability; this.finish=finish;
        this.washable=washable; this.installationType=installationType; this.roomType=roomType; this.price=price;
        this.style=style; this.ecoFriendly=ecoFriendly; this.moistureResistant=moistureResistant; this.peelable=peelable;
        this.removable=removable; this.adhesiveType=adhesiveType;
    }

    void display(){
        System.out.println(color+" "+texture+" "+material+" "+design+" "+brand+" "+size+" "+pattern+" "+thickness+" "+durability+" "+finish+" "+washable+" "+installationType+" "+roomType+" "+price+" "+style+" "+ecoFriendly+" "+moistureResistant+" "+peelable+" "+removable+" "+adhesiveType);
    }
}