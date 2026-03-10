public class Pumpkin {

    int weight;
    String color;
    PumpkinVariety variety;

    public Pumpkin(int weight, String color, PumpkinVariety variety) {
        this.weight = weight;
        this.color = color;
        this.variety = variety;
    }

    public void printInfo() {
        if(color != null && variety != null) {
            System.out.println(weight + " " + color + " " + variety);
        }
    }
}