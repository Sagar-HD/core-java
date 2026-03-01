class Organ {
    String name,function,size,weight,location,structure,cells,tissueType,bloodSupply,health,
           disease,protection,role,development,system,support,control,activity,regeneration,importance;

    Organ(String name,String function,String size,String weight,String location,String structure,String cells,String tissueType,String bloodSupply,String health,
          String disease,String protection,String role,String development,String system,String support,String control,String activity,String regeneration,String importance){
        this.name=name; this.function=function; this.size=size; this.weight=weight; this.location=location;
        this.structure=structure; this.cells=cells; this.tissueType=tissueType; this.bloodSupply=bloodSupply;
        this.health=health; this.disease=disease; this.protection=protection; this.role=role;
        this.development=development; this.system=system; this.support=support;
        this.control=control; this.activity=activity; this.regeneration=regeneration; this.importance=importance;
    }
    void display(){
        System.out.println(name+" "+function+" "+size+" "+weight+" "+location+" "+structure+" "+cells+" "+tissueType+" "+bloodSupply+" "+health+" "+disease+" "+protection+" "+role+" "+development+" "+system+" "+support+" "+control+" "+activity+" "+regeneration+" "+importance);
    }
}