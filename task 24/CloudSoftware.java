class CloudSoftware {
    String name;
    String provider;
    double price;
    String platform;
    int users;
    boolean subscription;

    CloudSoftware(String name, String provider, double price, String platform, int users, boolean subscription) {
        this.name = name;
        this.provider = provider;
        this.price = price;
        this.platform = platform;
        this.users = users;
        this.subscription = subscription;
    }
}