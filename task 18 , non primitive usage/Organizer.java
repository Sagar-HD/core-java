class Organizer {
    String type,material,size,compartments,color,brand,usage,portability,design,durability,
           price,shape,storage,weight,style,installation,surface,capacity,finish,accessibility;

    Organizer(String type,String material,String size,String compartments,String color,String brand,String usage,String portability,String design,String durability,
              String price,String shape,String storage,String weight,String style,String installation,String surface,String capacity,String finish,String accessibility){
        this.type=type; this.material=material; this.size=size; this.compartments=compartments;
        this.color=color; this.brand=brand; this.usage=usage; this.portability=portability;
        this.design=design; this.durability=durability; this.price=price;
        this.shape=shape; this.storage=storage; this.weight=weight;
        this.style=style; this.installation=installation;
        this.surface=surface; this.capacity=capacity;
        this.finish=finish; this.accessibility=accessibility;
    }
    void display(){
        System.out.println(type+" "+material+" "+size+" "+compartments+" "+color+" "+brand+" "+usage+" "+portability+" "+design+" "+durability+" "+price+" "+shape+" "+storage+" "+weight+" "+style+" "+installation+" "+surface+" "+capacity+" "+finish+" "+accessibility);
    }
}