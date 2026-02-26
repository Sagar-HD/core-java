class StadiumCreator {

    static void create() {
        Stadium s = new Stadium();
        System.out.println(s.name + " " + s.capacity);
    }

    static void create(String name) {
        Stadium s = new Stadium(name);
        System.out.println(s.name + " " + s.capacity);
    }

    static void create(String name, int capacity) {
        Stadium s = new Stadium(name, capacity);
        System.out.println(s.name + " " + s.capacity);
    }
}