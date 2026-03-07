class Therapist {
    String name;
    int experience;

    Therapist(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    void displayInfo() {
        System.out.println("Therapist Name: " + name);
        System.out.println("Years of Experience: " + experience);
    }
}

class Service {
    String type;
    double price;

    Service(String type, double price) {
        this.type = type;
        this.price = price;
    }

    void displayInfo() {
        System.out.println("Service Type: " + type);
        System.out.println("Service Price: " + price);
    }
}

class Customer {
    String name;
    int id;

    Customer(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayInfo() {
        System.out.println("Customer Name: " + name);
        System.out.println("Customer ID: " + id);
    }
}

class Booking {
    String date;
    String time;

    Booking(String date, String time) {
        this.date = date;
        this.time = time;
    }

    void displayInfo() {
        System.out.println("Booking Date: " + date);
        System.out.println("Booking Time: " + time);
    }
}

class Room {
    int roomNumber;
    String type;

    Room(int roomNumber, String type) {
        this.roomNumber = roomNumber;
        this.type = type;
    }

    void displayInfo() {
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Room Type: " + type);
    }
}

class Spa {

    int spaId;
    double rating;
    boolean open;
    char category;
    float discount;

    Therapist therapist;
    Service service;
    Customer customer;
    Booking booking;
    Room room;

    Spa(int spaId, double rating, boolean open, char category, float discount,
        Therapist therapist, Service service, Customer customer,
        Booking booking, Room room) {

        this.spaId = spaId;
        this.rating = rating;
        this.open = open;
        this.category = category;
        this.discount = discount;

        this.therapist = therapist;
        this.service = service;
        this.customer = customer;
        this.booking = booking;
        this.room = room;
    }

    void displayInfo() {
        System.out.println("Spa ID: " + spaId);
        System.out.println("Rating: " + rating);
        System.out.println("Open Status: " + open);
        System.out.println("Category: " + category);
        System.out.println("Discount: " + discount);

        therapist.displayInfo();
        service.displayInfo();
        customer.displayInfo();
        booking.displayInfo();
        room.displayInfo();
    }
}

public class SpaRunner {

    public static void main(String[] args) {

        Therapist therapist = new Therapist("Anita", 5);
        Service service = new Service("Aromatherapy", 2500);
        Customer customer = new Customer("Rahul", 101);
        Booking booking = new Booking("2026-03-07", "4 PM");
        Room room = new Room(12, "Luxury");

        Spa spa = new Spa(1, 4.8, true, 'A', 10.5f,
                therapist, service, customer, booking, room);

        spa.displayInfo();
    }
}