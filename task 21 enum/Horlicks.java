public class Horlicks {

    int weight;
    String brand;
    HorlicksFlavor flavor;

    public Horlicks(int weight, String brand, HorlicksFlavor flavor) {
        this.weight = weight;
        this.brand = brand;
        this.flavor = flavor;
    }

    public void printInfo() {
        if(brand != null && flavor != null) {
            System.out.println(weight + " " + brand + " " + flavor);
        }
    }
}