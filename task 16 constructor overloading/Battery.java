class Battery {
    String brand;
    double capacity;
    String type;
    boolean rechargeable;
    double price;

    Battery() {}

    Battery(String brand) {
        this.brand = brand;
    }

    Battery(String brand, double capacity) {
        this.brand = brand;
        this.capacity = capacity;
    }

    Battery(String brand, double capacity, String type) {
        this.brand = brand;
        this.capacity = capacity;
        this.type = type;
    }

    Battery(String brand, double capacity, String type, boolean rechargeable) {
        this.brand = brand;
        this.capacity = capacity;
        this.type = type;
        this.rechargeable = rechargeable;
    }

    Battery(String brand, double capacity, String type, boolean rechargeable, double price) {
        this.brand = brand;
        this.capacity = capacity;
        this.type = type;
        this.rechargeable = rechargeable;
        this.price = price;
    }

    void display() {
        System.out.println(brand + " " + capacity + " " + type + " " + rechargeable + " " + price);
    }
}