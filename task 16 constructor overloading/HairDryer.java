class HairDryer {
    String brand;
    int power;
    String color;
    boolean ionic;
    double price;

    HairDryer() {}

    HairDryer(String brand) {
        this.brand = brand;
    }

    HairDryer(String brand, int power) {
        this.brand = brand;
        this.power = power;
    }

    HairDryer(String brand, int power, String color) {
        this.brand = brand;
        this.power = power;
        this.color = color;
    }

    HairDryer(String brand, int power, String color, boolean ionic) {
        this.brand = brand;
        this.power = power;
        this.color = color;
        this.ionic = ionic;
    }

    HairDryer(String brand, int power, String color, boolean ionic, double price) {
        this.brand = brand;
        this.power = power;
        this.color = color;
        this.ionic = ionic;
        this.price = price;
    }

    void display() {
        System.out.println(brand + " " + power + " " + color + " " + ionic + " " + price);
    }
}