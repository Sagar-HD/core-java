class Fish {
    String type;
    int count;

    Fish(String type, int count) {
        this.type = type;
        this.count = count;
    }

    void displayInfo() {
        System.out.println("Fish Type: " + type);
        System.out.println("Fish Count: " + count);
    }
}

class Filter {
    String brand;
    int capacity;

    Filter(String brand, int capacity) {
        this.brand = brand;
        this.capacity = capacity;
    }

    void displayInfo() {
        System.out.println("Filter Brand: " + brand);
        System.out.println("Filter Capacity: " + capacity);
    }
}

class Owner {
    String name;
    int id;

    Owner(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayInfo() {
        System.out.println("Owner Name: " + name);
        System.out.println("Owner ID: " + id);
    }
}

class Decoration {
    String type;
    int quantity;

    Decoration(String type, int quantity) {
        this.type = type;
        this.quantity = quantity;
    }

    void displayInfo() {
        System.out.println("Decoration Type: " + type);
        System.out.println("Quantity: " + quantity);
    }
}

class Lighting {
    String color;
    int watt;

    Lighting(String color, int watt) {
        this.color = color;
        this.watt = watt;
    }

    void displayInfo() {
        System.out.println("Lighting Color: " + color);
        System.out.println("Watt: " + watt);
    }
}

class Aquarium {

    int aquariumId;
    double capacity;
    boolean clean;
    char size;
    float rating;

    Fish fish;
    Filter filter;
    Owner owner;
    Decoration decoration;
    Lighting lighting;

    Aquarium(int aquariumId, double capacity, boolean clean, char size, float rating,
             Fish fish, Filter filter, Owner owner,
             Decoration decoration, Lighting lighting) {

        this.aquariumId = aquariumId;
        this.capacity = capacity;
        this.clean = clean;
        this.size = size;
        this.rating = rating;

        this.fish = fish;
        this.filter = filter;
        this.owner = owner;
        this.decoration = decoration;
        this.lighting = lighting;
    }

    void displayInfo() {
        System.out.println("Aquarium ID: " + aquariumId);
        System.out.println("Capacity: " + capacity);
        System.out.println("Clean: " + clean);
        System.out.println("Size: " + size);
        System.out.println("Rating: " + rating);

        fish.displayInfo();
        filter.displayInfo();
        owner.displayInfo();
        decoration.displayInfo();
        lighting.displayInfo();
    }
}

public class AquariumRunner {

    public static void main(String[] args) {

        Fish fish = new Fish("Goldfish", 5);
        Filter filter = new Filter("AquaClear", 300);
        Owner owner = new Owner("Rahul", 101);
        Decoration decoration = new Decoration("Coral", 3);
        Lighting lighting = new Lighting("Blue", 40);

        Aquarium aquarium = new Aquarium(1, 120.5, true, 'M', 4.6f,
                fish, filter, owner, decoration, lighting);

        aquarium.displayInfo();
    }
}