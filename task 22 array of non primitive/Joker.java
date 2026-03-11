class Joker {

    String[] jokes;
    Joker[] jokers;

    Joker(String[] jokes, Joker[] jokers){
        this.jokes = jokes;
        this.jokers = jokers;
    }

    void info(){

        System.out.println("Joker Info");

        for(String j : jokes){
            System.out.println(j);
        }

        if(jokers != null){
            System.out.println("Joker Objects: " + jokers.length);
        }
    }
}