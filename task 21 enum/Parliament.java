public class Parliament {

    int members;
    String location;
    ParliamentType type;

    public Parliament(int members, String location, ParliamentType type) {
        this.members = members;
        this.location = location;
        this.type = type;
    }

    public void printInfo() {
        if (location != null && type != null) {
            System.out.println("Parliament -> Members:" + members + ", Location:" + location + ", Type:" + type);
        }
    }
}