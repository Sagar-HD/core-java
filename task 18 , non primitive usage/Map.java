class Map {
    String region,scale,type,publisher,material,language,detailLevel,theme,color,size,
           price,year,projection,usage,foldable,laminated,accuracy,legend,digitalVersion,orientation;

    Map(String region,String scale,String type,String publisher,String material,String language,String detailLevel,String theme,String color,String size,
        String price,String year,String projection,String usage,String foldable,String laminated,String accuracy,String legend,String digitalVersion,String orientation){
        this.region=region; this.scale=scale; this.type=type; this.publisher=publisher; this.material=material;
        this.language=language; this.detailLevel=detailLevel; this.theme=theme; this.color=color; this.size=size;
        this.price=price; this.year=year; this.projection=projection; this.usage=usage;
        this.foldable=foldable; this.laminated=laminated; this.accuracy=accuracy;
        this.legend=legend; this.digitalVersion=digitalVersion; this.orientation=orientation;
    }
    void display(){
        System.out.println(region+" "+scale+" "+type+" "+publisher+" "+material+" "+language+" "+detailLevel+" "+theme+" "+color+" "+size+" "+price+" "+year+" "+projection+" "+usage+" "+foldable+" "+laminated+" "+accuracy+" "+legend+" "+digitalVersion+" "+orientation);
    }
}