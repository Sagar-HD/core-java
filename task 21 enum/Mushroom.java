public class Mushroom {

    int quantity;
    String color;
    MushroomVariety variety;

    public Mushroom(int quantity, String color, MushroomVariety variety) {
        this.quantity = quantity;
        this.color = color;
        this.variety = variety;
    }

    public void printInfo() {
        if(color != null && variety != null) {
            System.out.println(quantity + " " + color + " " + variety);
        }
    }
}