public class Court {

    int judges;
    String city;
    CourtLevel level;

    public Court(int judges, String city, CourtLevel level) {
        this.judges = judges;
        this.city = city;
        this.level = level;
    }

    public void printInfo() {
        if (city != null && level != null) {
            System.out.println("Court -> Judges:" + judges + ", City:" + city + ", Level:" + level);
        }
    }
}