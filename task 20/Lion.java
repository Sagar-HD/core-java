class Habitat {
    String location;
    String climate;

    Habitat(String location, String climate) {
        this.location = location;
        this.climate = climate;
    }

    void displayInfo() {
        System.out.println("Habitat Location: " + location);
        System.out.println("Climate: " + climate);
    }
}

class Mane {
    String color;
    int length;

    Mane(String color, int length) {
        this.color = color;
        this.length = length;
    }

    void displayInfo() {
        System.out.println("Mane Color: " + color);
        System.out.println("Mane Length: " + length);
    }
}

class Claw {
    int count;
    double size;

    Claw(int count, double size) {
        this.count = count;
        this.size = size;
    }

    void displayInfo() {
        System.out.println("Claw Count: " + count);
        System.out.println("Claw Size: " + size);
    }
}

class Tail {
    double length;
    String type;

    Tail(double length, String type) {
        this.length = length;
        this.type = type;
    }

    void displayInfo() {
        System.out.println("Tail Length: " + length);
        System.out.println("Tail Type: " + type);
    }
}

class Pride {
    int members;
    String leader;

    Pride(int members, String leader) {
        this.members = members;
        this.leader = leader;
    }

    void displayInfo() {
        System.out.println("Pride Members: " + members);
        System.out.println("Pride Leader: " + leader);
    }
}

class Lion {

    int age;
    double weight;
    boolean wild;
    char gender;
    String name;

    Habitat habitat;
    Mane mane;
    Claw claw;
    Tail tail;
    Pride pride;

    Lion(int age, double weight, boolean wild, char gender, String name,
         Habitat habitat, Mane mane, Claw claw, Tail tail, Pride pride) {

        this.age = age;
        this.weight = weight;
        this.wild = wild;
        this.gender = gender;
        this.name = name;

        this.habitat = habitat;
        this.mane = mane;
        this.claw = claw;
        this.tail = tail;
        this.pride = pride;
    }

    void displayInfo() {
        System.out.println("Lion Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Wild: " + wild);
        System.out.println("Gender: " + gender);

        habitat.displayInfo();
        mane.displayInfo();
        claw.displayInfo();
        tail.displayInfo();
        pride.displayInfo();
    }
}

public class LionRunner {

    public static void main(String[] args) {

        Habitat habitat = new Habitat("Savannah", "Hot");
        Mane mane = new Mane("Golden", 25);
        Claw claw = new Claw(18, 3.5);
        Tail tail = new Tail(1.2, "Tufted");
        Pride pride = new Pride(10, "Simba");

        Lion lion = new Lion(8, 190.5, true, 'M', "Leo",
                habitat, mane, claw, tail, pride);

        lion.displayInfo();
    }
}