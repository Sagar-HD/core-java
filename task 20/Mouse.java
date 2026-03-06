public class Mouse {

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

    public Mouse(int id, double weight, boolean wireless, char size, String brand,
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
}
public class Button {
    int count;
    String type;

    public Button(int count, String type) {
        this.count = count;
        this.type = type;
    }
}
public class Button {
    int count;
    String type;

    public Button(int count, String type) {
        this.count = count;
        this.type = type;
    }
}
public class ScrollWheel {
    String material;
    boolean clickable;

    public ScrollWheel(String material, boolean clickable) {
        this.material = material;
        this.clickable = clickable;
    }
}
public class Sensor {
    String technology;
    int dpi;

    public Sensor(String technology, int dpi) {
        this.technology = technology;
        this.dpi = dpi;
    }
}
public class Battery {
    int capacity;
    String type;

    public Battery(int capacity, String type) {
        this.capacity = capacity;
        this.type = type;
    }
}