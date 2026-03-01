class Brain {
    String hemisphere,function,neurons,weight,protection,activity,memory,learning,cognition,emotion,
           control,coordination,bloodSupply,oxygenUse,development,aging,health,structure,lobes,signals;

    Brain(String hemisphere,String function,String neurons,String weight,String protection,String activity,String memory,String learning,String cognition,String emotion,
          String control,String coordination,String bloodSupply,String oxygenUse,String development,String aging,String health,String structure,String lobes,String signals){
        this.hemisphere=hemisphere; this.function=function; this.neurons=neurons; this.weight=weight; this.protection=protection;
        this.activity=activity; this.memory=memory; this.learning=learning; this.cognition=cognition; this.emotion=emotion;
        this.control=control; this.coordination=coordination; this.bloodSupply=bloodSupply; this.oxygenUse=oxygenUse;
        this.development=development; this.aging=aging; this.health=health;
        this.structure=structure; this.lobes=lobes; this.signals=signals;
    }
    void display(){
        System.out.println(hemisphere+" "+function+" "+neurons+" "+weight+" "+protection+" "+activity+" "+memory+" "+learning+" "+cognition+" "+emotion+" "+control+" "+coordination+" "+bloodSupply+" "+oxygenUse+" "+development+" "+aging+" "+health+" "+structure+" "+lobes+" "+signals);
    }
}