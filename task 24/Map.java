class Map {
    String region;
    String type;
    double scale;
    String publisher;
    int year;
    boolean digital;

    Map(String region, String type, double scale, String publisher, int year, boolean digital) {
        this.region = region;
        this.type = type;
        this.scale = scale;
        this.publisher = publisher;
        this.year = year;
        this.digital = digital;
    }
}