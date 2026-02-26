class MuseumCreator {

    static void create() {
        Museum m = new Museum();
        System.out.println(m.name + " " + m.ticketPrice);
    }

    static void create(String name) {
        Museum m = new Museum(name);
        System.out.println(m.name + " " + m.ticketPrice);
    }

    static void create(String name, int price) {
        Museum m = new Museum(name, price);
        System.out.println(m.name + " " + m.ticketPrice);
    }
}