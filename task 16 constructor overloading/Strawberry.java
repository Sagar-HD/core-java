class Strawberry {
    String variety;
    String color;
    double weight;
    boolean organic;
    double price;

    Strawberry() {}

    Strawberry(String variety) {
        this.variety = variety;
    }

    Strawberry(String variety, String color) {
        this.variety = variety;
        this.color = color;
    }

    Strawberry(String variety, String color, double weight) {
        this.variety = variety;
        this.color = color;
        this.weight = weight;
    }

    Strawberry(String variety, String color, double weight, boolean organic) {
        this.variety = variety;
        this.color = color;
        this.weight = weight;
        this.organic = organic;
    }

    Strawberry(String variety, String color, double weight, boolean organic, double price) {
        this.variety = variety;
        this.color = color;
        this.weight = weight;
        this.organic = organic;
        this.price = price;
    }

    void display() {
        System.out.println(variety + " " + color + " " + weight + " " + organic + " " + price);
    }
}