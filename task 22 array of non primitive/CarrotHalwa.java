class CarrotHalwa {

    String[] ingredients;
    CarrotHalwa[] halwas;

    CarrotHalwa(String[] ingredients, CarrotHalwa[] halwas){
        this.ingredients = ingredients;
        this.halwas = halwas;
    }

    void info(){

        System.out.println("CarrotHalwa Info");

        for(String i : ingredients){
            System.out.println(i);
        }

        if(halwas != null){
            System.out.println("CarrotHalwa Objects: " + halwas.length);
        }
    }
}