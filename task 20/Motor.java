public class Engine {
    int cylinders;
    String type;

    public Engine(int cylinders, String type) {
        this.cylinders = cylinders;
        this.type = type;
    }
}
public class Gearbox {
    int gears;
    String transmission;

    public Gearbox(int gears, String transmission) {
        this.gears = gears;
        this.transmission = transmission;
    }
}
public class FuelTank {
    int capacity;
    String fuelType;

    public FuelTank(int capacity, String fuelType) {
        this.capacity = capacity;
        this.fuelType = fuelType;
    }
}
public class Wheel {
    int count;
    double size;

    public Wheel(int count, double size) {
        this.count = count;
        this.size = size;
    }
}
public class Dashboard {
    String displayType;
    boolean digital;

    public Dashboard(String displayType, boolean digital) {
        this.displayType = displayType;
        this.digital = digital;
    }
}
public class Motor {

    int id;
    double power;
    boolean electric;
    char grade;
    String brand;

    Engine engine;
    Gearbox gearbox;
    FuelTank fuelTank;
    Wheel wheel;
    Dashboard dashboard;

    public Motor(int id, double power, boolean electric, char grade, String brand,
                 Engine engine, Gearbox gearbox, FuelTank fuelTank,
                 Wheel wheel, Dashboard dashboard) {

        this.id = id;
        this.power = power;
        this.electric = electric;
        this.grade = grade;
        this.brand = brand;

        this.engine = engine;
        this.gearbox = gearbox;
        this.fuelTank = fuelTank;
        this.wheel = wheel;
        this.dashboard = dashboard;
    }
}