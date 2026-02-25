class Snow {
    String type;
    double thickness;
    String location;
    boolean melting;
    double temperature;

    Snow() {}

    Snow(String type) {
        this.type = type;
    }

    Snow(String type, double thickness) {
        this.type = type;
        this.thickness = thickness;
    }

    Snow(String type, double thickness, String location) {
        this.type = type;
        this.thickness = thickness;
        this.location = location;
    }

    Snow(String type, double thickness, String location, boolean melting) {
        this.type = type;
        this.thickness = thickness;
        this.location = location;
        this.melting = melting;
    }

    Snow(String type, double thickness, String location, boolean melting, double temperature) {
        this.type = type;
        this.thickness = thickness;
        this.location = location;
        this.melting = melting;
        this.temperature = temperature;
    }

    void display() {
        System.out.println(type + " " + thickness + " " + location + " " + melting + " " + temperature);
    }
}