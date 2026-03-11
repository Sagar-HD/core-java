class Jamoon {

    String[] flavors;
    Jamoon[] jamoons;

    Jamoon(String[] flavors, Jamoon[] jamoons){
        this.flavors = flavors;
        this.jamoons = jamoons;
    }

    void info(){

        System.out.println("Jamoon Info");

        for(String f : flavors){
            System.out.println(f);
        }

        if(jamoons != null){
            System.out.println("Jamoon Objects: " + jamoons.length);
        }
    }
}