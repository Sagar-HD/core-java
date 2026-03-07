class Mouse {

    int id;
    double weight;
    boolean wireless;
    char size;
    String brand;

    Battery battery;
    Sensor sensor;
    ScrollWheel scrollWheel;
    UsbReceiver usbReceiver;
    Button button;

    Mouse(int id, double weight, boolean wireless, char size, String brand,
          Battery battery, Sensor sensor, ScrollWheel scrollWheel,
          UsbReceiver usbReceiver, Button button) {

        this.id = id;
        this.weight = weight;
        this.wireless = wireless;
        this.size = size;
        this.brand = brand;

        this.battery = battery;
        this.sensor = sensor;
        this.scrollWheel = scrollWheel;
        this.usbReceiver = usbReceiver;
        this.button = button;
    }

    void displayInfo() {
        System.out.println("Mouse ID: " + id);
        System.out.println("Weight: " + weight);
        System.out.println("Wireless: " + wireless);
        System.out.println("Size: " + size);
        System.out.println("Brand: " + brand);

        battery.displayInfo();
        sensor.displayInfo();
        scrollWheel.displayInfo();
        usbReceiver.displayInfo();
        button.displayInfo();
    }
}

class Button {
    int count;
    String type;

    Button(int count, String type) {
        this.count = count;
        this.type = type;
    }

    void displayInfo() {
        System.out.println("Button Count: " + count);
        System.out.println("Button Type: " + type);
    }
}

class ScrollWheel {
    String material;
    boolean clickable;

    ScrollWheel(String material, boolean clickable) {
        this.material = material;
        this.clickable = clickable;
    }

    void displayInfo() {
        System.out.println("ScrollWheel Material: " + material);
        System.out.println("Clickable: " + clickable);
    }
}

class Sensor {
    String technology;
    int dpi;

    Sensor(String technology, int dpi) {
        this.technology = technology;
        this.dpi = dpi;
    }

    void displayInfo() {
        System.out.println("Sensor Technology: " + technology);
        System.out.println("DPI: " + dpi);
    }
}

class Battery {
    int capacity;
    String type;

    Battery(int capacity, String type) {
        this.capacity = capacity;
        this.type = type;
    }

    void displayInfo() {
        System.out.println("Battery Capacity: " + capacity);
        System.out.println("Battery Type: " + type);
    }
}

class UsbReceiver {
    String version;
    String compatibility;

    UsbReceiver(String version, String compatibility) {
        this.version = version;
        this.compatibility = compatibility;
    }

    void displayInfo() {
        System.out.println("USB Version: " + version);
        System.out.println("Compatibility: " + compatibility);
    }
}

public class Runner {

    public static void main(String[] args) {

        Battery battery = new Battery(500, "Lithium");
        Sensor sensor = new Sensor("Optical", 1600);
        ScrollWheel scrollWheel = new ScrollWheel("Rubber", true);
        UsbReceiver usbReceiver = new UsbReceiver("USB 2.0", "Windows/Mac");
        Button button = new Button(3, "Mechanical");

        Mouse mouse = new Mouse(101, 120.5, true, 'M', "Logitech",
                battery, sensor, scrollWheel, usbReceiver, button);

        mouse.displayInfo();
    }
}