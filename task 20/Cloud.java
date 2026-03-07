class Provider {
    String name;
    String region;

    Provider(String name, String region) {
        this.name = name;
        this.region = region;
    }

    void displayInfo() {
        System.out.println("Provider Name: " + name);
        System.out.println("Region: " + region);
    }
}

class Service {
    String type;
    int instances;

    Service(String type, int instances) {
        this.type = type;
        this.instances = instances;
    }

    void displayInfo() {
        System.out.println("Service Type: " + type);
        System.out.println("Instances: " + instances);
    }
}

class Security {
    String level;
    boolean firewall;

    Security(String level, boolean firewall) {
        this.level = level;
        this.firewall = firewall;
    }

    void displayInfo() {
        System.out.println("Security Level: " + level);
        System.out.println("Firewall Enabled: " + firewall);
    }
}

class Storage {
    String type;
    int capacity;

    Storage(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    void displayInfo() {
        System.out.println("Storage Type: " + type);
        System.out.println("Capacity: " + capacity);
    }
}

class User {
    String name;
    int id;

    User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayInfo() {
        System.out.println("User Name: " + name);
        System.out.println("User ID: " + id);
    }
}

class Cloud {

    int cloudId;
    double uptime;
    boolean active;
    char tier;
    float cost;

    Provider provider;
    Service service;
    Security security;
    Storage storage;
    User user;

    Cloud(int cloudId, double uptime, boolean active, char tier, float cost,
          Provider provider, Service service, Security security,
          Storage storage, User user) {

        this.cloudId = cloudId;
        this.uptime = uptime;
        this.active = active;
        this.tier = tier;
        this.cost = cost;

        this.provider = provider;
        this.service = service;
        this.security = security;
        this.storage = storage;
        this.user = user;
    }

    void displayInfo() {
        System.out.println("Cloud ID: " + cloudId);
        System.out.println("Uptime: " + uptime);
        System.out.println("Active: " + active);
        System.out.println("Tier: " + tier);
        System.out.println("Cost: " + cost);

        provider.displayInfo();
        service.displayInfo();
        security.displayInfo();
        storage.displayInfo();
        user.displayInfo();
    }
}

public class CloudRunner {

    public static void main(String[] args) {

        Provider provider = new Provider("AWS", "Asia");
        Service service = new Service("Compute", 5);
        Security security = new Security("High", true);
        Storage storage = new Storage("SSD", 500);
        User user = new User("Rahul", 101);

        Cloud cloud = new Cloud(1, 99.9, true, 'P', 1200.5f,
                provider, service, security, storage, user);

        cloud.displayInfo();
    }
}