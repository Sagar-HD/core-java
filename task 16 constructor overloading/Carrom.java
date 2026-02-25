class Carrom {
    String material;
    double size;
    String color;
    boolean withCoins;
    double price;

    Carrom() {}

    Carrom(String material) {
        this.material = material;
    }

    Carrom(String material, double size) {
        this.material = material;
        this.size = size;
    }

    Carrom(String material, double size, String color) {
        this.material = material;
        this.size = size;
        this.color = color;
    }

    Carrom(String material, double size, String color, boolean withCoins) {
        this.material = material;
        this.size = size;
        this.color = color;
        this.withCoins = withCoins;
    }

    Carrom(String material, double size, String color, boolean withCoins, double price) {
        this.material = material;
        this.size = size;
        this.color = color;
        this.withCoins = withCoins;
        this.price = price;
    }

    void display() {
        System.out.println(material + " " + size + " " + color + " " + withCoins + " " + price);
    }
}