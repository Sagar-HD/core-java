class Carpenter {

    int[] tools;
    Carpenter[] carpenters;

    Carpenter(int[] tools, Carpenter[] carpenters) {
        this.tools = tools;
        this.carpenters = carpenters;
    }

    void info() {

        for(int t : tools){
            System.out.println(t);
        }

        if(carpenters != null){
            for(Carpenter c : carpenters){
                System.out.println(c);
            }
        }
    }
}