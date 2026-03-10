public class Paneer {

    int weight;
    String brand;
    PaneerType type;

    public Paneer(int weight, String brand, PaneerType type) {
        this.weight = weight;
        this.brand = brand;
        this.type = type;
    }

    public void printInfo() {
        if(brand != null && type != null) {
            System.out.println(weight + " " + brand + " " + type);
        }
    }
}