class Rain {
    String type;
    double intensity;
    String region;
    boolean thunder;
    double duration;

    Rain() {}

    Rain(String type) {
        this.type = type;
    }

    Rain(String type, double intensity) {
        this.type = type;
        this.intensity = intensity;
    }

    Rain(String type, double intensity, String region) {
        this.type = type;
        this.intensity = intensity;
        this.region = region;
    }

    Rain(String type, double intensity, String region, boolean thunder) {
        this.type = type;
        this.intensity = intensity;
        this.region = region;
        this.thunder = thunder;
    }

    Rain(String type, double intensity, String region, boolean thunder, double duration) {
        this.type = type;
        this.intensity = intensity;
        this.region = region;
        this.thunder = thunder;
        this.duration = duration;
    }

    void display() {
        System.out.println(type + " " + intensity + " " + region + " " + thunder + " " + duration);
    }
}