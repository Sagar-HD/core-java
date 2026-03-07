class Material {
    String type;
    int weight;

    Material(String type, int weight) {
        this.type = type;
        this.weight = weight;
    }

    void displayInfo() {
        System.out.println("Material Type: " + type);
        System.out.println("Weight: " + weight);
    }
}

class Sound {
    String tone;
    int volume;

    Sound(String tone, int volume) {
        this.tone = tone;
        this.volume = volume;
    }

    void displayInfo() {
        System.out.println("Sound Tone: " + tone);
        System.out.println("Volume: " + volume);
    }
}

class Location {
    String place;
    String building;

    Location(String place, String building) {
        this.place = place;
        this.building = building;
    }

    void displayInfo() {
        System.out.println("Place: " + place);
        System.out.println("Building: " + building);
    }
}

class Manufacturer {
    String name;
    int year;

    Manufacturer(String name, int year) {
        this.name = name;
        this.year = year;
    }

    void displayInfo() {
        System.out.println("Manufacturer Name: " + name);
        System.out.println("Year: " + year);
    }
}

class Usage {
    String purpose;
    int frequency;

    Usage(String purpose, int frequency) {
        this.purpose = purpose;
        this.frequency = frequency;
    }

    void displayInfo() {
        System.out.println("Purpose: " + purpose);
        System.out.println("Frequency: " + frequency);
    }
}

class Bell {

    int bellId;
    double size;
    boolean ringing;
    char category;
    float rating;

    Material material;
    Sound sound;
    Location location;
    Manufacturer manufacturer;
    Usage usage;

    Bell(int bellId, double size, boolean ringing, char category, float rating,
         Material material, Sound sound, Location location,
         Manufacturer manufacturer, Usage usage) {

        this.bellId = bellId;
        this.size = size;
        this.ringing = ringing;
        this.category = category;
        this.rating = rating;

        this.material = material;
        this.sound = sound;
        this.location = location;
        this.manufacturer = manufacturer;
        this.usage = usage;
    }

    void displayInfo() {
        System.out.println("Bell ID: " + bellId);
        System.out.println("Size: " + size);
        System.out.println("Ringing: " + ringing);
        System.out.println("Category: " + category);
        System.out.println("Rating: " + rating);

        material.displayInfo();
        sound.displayInfo();
        location.displayInfo();
        manufacturer.displayInfo();
        usage.displayInfo();
    }
}

public class BellRunner {

    public static void main(String[] args) {

        Material material = new Material("Bronze", 5);
        Sound sound = new Sound("Loud", 80);
        Location location = new Location("Temple", "Main Hall");
        Manufacturer manufacturer = new Manufacturer("Sharma Metals", 2015);
        Usage usage = new Usage("Prayer", 10);

        Bell bell = new Bell(1, 12.5, true, 'A', 4.3f,
                material, sound, location, manufacturer, usage);

        bell.displayInfo();
    }
}