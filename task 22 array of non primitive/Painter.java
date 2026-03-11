class Painter {

    String[] colors;
    Painter[] painters;

    Painter(String[] colors, Painter[] painters) {
        this.colors = colors;
        this.painters = painters;
    }

    void info() {
        for(String c : colors){
            System.out.println(c);
        }

        if(painters != null){
            for(Painter p : painters){
                System.out.println(p);
            }
        }
    }
}