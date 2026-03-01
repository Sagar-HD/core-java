class DumbBell {
    String weight,material,gripType,coating,brand,size,color,shape,durability,usage,
           price,adjustability,texture,balance,handleLength,storage,rubberized,fitnessLevel,portability,safety;

    DumbBell(String weight,String material,String gripType,String coating,String brand,String size,String color,String shape,String durability,String usage,
             String price,String adjustability,String texture,String balance,String handleLength,String storage,String rubberized,String fitnessLevel,String portability,String safety){
        this.weight=weight; this.material=material; this.gripType=gripType; this.coating=coating; this.brand=brand;
        this.size=size; this.color=color; this.shape=shape; this.durability=durability; this.usage=usage;
        this.price=price; this.adjustability=adjustability; this.texture=texture; this.balance=balance;
        this.handleLength=handleLength; this.storage=storage; this.rubberized=rubberized;
        this.fitnessLevel=fitnessLevel; this.portability=portability; this.safety=safety;
    }
    void display(){
        System.out.println(weight+" "+material+" "+gripType+" "+coating+" "+brand+" "+size+" "+color+" "+shape+" "+durability+" "+usage+" "+price+" "+adjustability+" "+texture+" "+balance+" "+handleLength+" "+storage+" "+rubberized+" "+fitnessLevel+" "+portability+" "+safety);
    }
}