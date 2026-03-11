class Hammer {

    int[] weights;
    Hammer[] hammers;

    Hammer(int[] weights, Hammer[] hammers){
        this.weights = weights;
        this.hammers = hammers;
    }

    void info(){

        System.out.println("Hammer Info");

        for(int w : weights){
            System.out.println(w);
        }

        if(hammers != null){
            System.out.println("Hammer Objects: " + hammers.length);
        }
    }
}