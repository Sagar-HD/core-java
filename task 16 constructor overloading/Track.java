class Track {
    String name;
    double length;
    String location;
    boolean indoor;
    double recordTime;

    Track() {}

    Track(String name) {
        this.name = name;
    }

    Track(String name, double length) {
        this.name = name;
        this.length = length;
    }

    Track(String name, double length, String location) {
        this.name = name;
        this.length = length;
        this.location = location;
    }

    Track(String name, double length, String location, boolean indoor) {
        this.name = name;
        this.length = length;
        this.location = location;
        this.indoor = indoor;
    }

    Track(String name, double length, String location, boolean indoor, double recordTime) {
        this.name = name;
        this.length = length;
        this.location = location;
        this.indoor = indoor;
        this.recordTime = recordTime;
    }

    void display() {
        System.out.println(name + " " + length + " " + location + " " + indoor + " " + recordTime);
    }
}