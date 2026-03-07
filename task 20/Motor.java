class Engine {
    int cylinders;
    String type;

    Engine(int cylinders, String type) {
        this.cylinders = cylinders;
        this.type = type;
    }

    void displayInfo() {
        System.out.println("Engine Cylinders: " + cylinders);
        System.out.println("Engine Type: " + type);
    }
}

class Gearbox {
    int gears;
    String transmission;

    Gearbox(int gears, String transmission) {
        this.gears = gears;
        this.transmission = transmission;
    }

    void displayInfo() {
        System.out.println("Gear Count: " + gears);
        System.out.println("Transmission: " + transmission);
    }
}

class FuelTank {
    int capacity;
    String fuelType;

    FuelTank(int capacity, String fuelType) {
        this.capacity = capacity;
        this.fuelType = fuelType;
    }

    void displayInfo() {
        System.out.println("Fuel Tank Capacity: " + capacity);
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Wheel {
    int count;
    double size;

    Wheel(int count, double size) {
        this.count = count;
        this.size = size;
    }

    void displayInfo() {
        System.out.println("Wheel Count: " + count);
        System.out.println("Wheel Size: " + size);
    }
}

class Dashboard {
    String displayType;
    boolean digital;

    Dashboard(String displayType, boolean digital) {
        this.displayType = displayType;
        this.digital = digital;
    }

    void displayInfo() {
        System.out.println("Dashboard Type: " + displayType);
        System.out.println("Digital: " + digital);
    }
}

class Motor {

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

    Motor(int id, double power, boolean electric, char grade, String brand,
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

    void displayInfo() {
        System.out.println("Motor ID: " + id);
        System.out.println("Power: " + power);
        System.out.println("Electric: " + electric);
        System.out.println("Grade: " + grade);
        System.out.println("Brand: " + brand);

        engine.displayInfo();
        gearbox.displayInfo();
        fuelTank.displayInfo();
        wheel.displayInfo();
        dashboard.displayInfo();
    }
}

public class MotorRunner {

    public static void main(String[] args) {

        Engine engine = new Engine(4, "Petrol");
        Gearbox gearbox = new Gearbox(6, "Manual");
        FuelTank fuelTank = new FuelTank(45, "Petrol");
        Wheel wheel = new Wheel(4, 17.5);
        Dashboard dashboard = new Dashboard("LCD", true);

        Motor motor = new Motor(101, 150.5, false, 'A', "Toyota",
                engine, gearbox, fuelTank, wheel, dashboard);

        motor.displayInfo();
    }
}