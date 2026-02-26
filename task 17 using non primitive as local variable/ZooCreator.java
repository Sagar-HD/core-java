class ZooCreator {

    static void create() {
        Zoo z = new Zoo();
        System.out.println(z.place + " " + z.animals);
    }

    static void create(String place) {
        Zoo z = new Zoo(place);
        System.out.println(z.place + " " + z.animals);
    }

    static void create(String place, int animals) {
        Zoo z = new Zoo(place, animals);
        System.out.println(z.place + " " + z.animals);
    }
}