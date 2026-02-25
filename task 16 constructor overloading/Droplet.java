class Droplet {
    String color;
    double volume;
    String shape;
    boolean isFalling;
    double temperature;

    Droplet() {}

    Droplet(String color) {
        this.color = color;
    }

    Droplet(String color, double volume) {
        this.color = color;
        this.volume = volume;
    }

    Droplet(String color, double volume, String shape) {
        this.color = color;
        this.volume = volume;
        this.shape = shape;
    }

    Droplet(String color, double volume, String shape, boolean isFalling) {
        this.color = color;
        this.volume = volume;
        this.shape = shape;
        this.isFalling = isFalling;
    }

    Droplet(String color, double volume, String shape, boolean isFalling, double temperature) {
        this.color = color;
        this.volume = volume;
        this.shape = shape;
        this.isFalling = isFalling;
        this.temperature = temperature;
    }

    void display() {
        System.out.println(color + " " + volume + " " + shape + " " + isFalling + " " + temperature);
    }
}