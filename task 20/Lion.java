public class Habitat {
    String location;
    String climate;

    public Habitat(String location, String climate) {
        this.location = location;
        this.climate = climate;
    }
}
public class Mane {
    String color;
    int length;

    public Mane(String color, int length) {
        this.color = color;
        this.length = length;
    }
}
public class Claw {
    int count;
    double size;

    public Claw(int count, double size) {
        this.count = count;
        this.size = size;
    }
}
public class Tail {
    double length;
    String type;

    public Tail(double length, String type) {
        this.length = length;
        this.type = type;
    }
}
public class Pride {
    int members;
    String leader;

    public Pride(int members, String leader) {
        this.members = members;
        this.leader = leader;
    }
}
public class Lion {

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

    public Lion(int age, double weight, boolean wild, char gender, String name,
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
}