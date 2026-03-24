class Tollgate {
    String name;
    String highway;
    String location;
    double fee;
    int lanes;
    boolean fastag;

    Tollgate(String name, String highway, String location, double fee, int lanes, boolean fastag) {
        this.name = name;
        this.highway = highway;
        this.location = location;
        this.fee = fee;
        this.lanes = lanes;
        this.fastag = fastag;
    }
}