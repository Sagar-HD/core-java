class Cell {
    String type,structure,nucleus,membrane,cytoplasm,function,division,size,shape,dna,
           rna,metabolism,growth,energy,transport,reproduction,lifespan,communication,adaptation,response;

    Cell(String type,String structure,String nucleus,String membrane,String cytoplasm,String function,String division,String size,String shape,String dna,
         String rna,String metabolism,String growth,String energy,String transport,String reproduction,String lifespan,String communication,String adaptation,String response){
        this.type=type; this.structure=structure; this.nucleus=nucleus; this.membrane=membrane; this.cytoplasm=cytoplasm;
        this.function=function; this.division=division; this.size=size; this.shape=shape;
        this.dna=dna; this.rna=rna; this.metabolism=metabolism; this.growth=growth;
        this.energy=energy; this.transport=transport; this.reproduction=reproduction;
        this.lifespan=lifespan; this.communication=communication; this.adaptation=adaptation; this.response=response;
    }
    void display(){
        System.out.println(type+" "+structure+" "+nucleus+" "+membrane+" "+cytoplasm+" "+function+" "+division+" "+size+" "+shape+" "+dna+" "+rna+" "+metabolism+" "+growth+" "+energy+" "+transport+" "+reproduction+" "+lifespan+" "+communication+" "+adaptation+" "+response);
    }
}