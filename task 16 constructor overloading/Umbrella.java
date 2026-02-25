class Umbrella {
    String brand;
    String color;
    double size;
    boolean automatic;
    double price;

    Umbrella() {}

    Umbrella(String brand) {
        this.brand = brand;
    }

    Umbrella(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    Umbrella(String brand, String color, double size) {
        this.brand = brand;
        this.color = color;
        this.size = size;
    }

    Umbrella(String brand, String color, double size, boolean automatic) {
        this.brand = brand;
        this.color = color;
        this.size = size;
        this.automatic = automatic;
    }

    Umbrella(String brand, String color, double size, boolean automatic, double price) {
        this.brand = brand;
        this.color = color;
        this.size = size;
        this.automatic = automatic;
        this.price = price;
    }

    void display() {
        System.out.println(brand + " " + color + " " + size + " " + automatic + " " + price);
    }
}