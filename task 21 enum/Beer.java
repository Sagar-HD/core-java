public class Beer {

    int volume;
    String brand;
    BeerType type;

    public Beer(int volume, String brand, BeerType type) {
        this.volume = volume;
        this.brand = brand;
        this.type = type;
    }

    public void printInfo() {
        if(brand != null && type != null) {
            System.out.println(volume + " " + brand + " " + type);
        }
    }
}