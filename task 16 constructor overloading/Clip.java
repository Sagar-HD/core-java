class Clip {
    String material;
    String color;
    double length;
    boolean flexible;
    double price;

    Clip() {}

    Clip(String material) {
        this.material = material;
    }

    Clip(String material, String color) {
        this.material = material;
        this.color = color;
    }

    Clip(String material, String color, double length) {
        this.material = material;
        this.color = color;
        this.length = length;
    }

    Clip(String material, String color, double length, boolean flexible) {
        this.material = material;
        this.color = color;
        this.length = length;
        this.flexible = flexible;
    }

    Clip(String material, String color, double length, boolean flexible, double price) {
        this.material = material;
        this.color = color;
        this.length = length;
        this.flexible = flexible;
        this.price = price;
    }

    void display() {
        System.out.println(material + " " + color + " " + length + " " + flexible + " " + price);
    }
}