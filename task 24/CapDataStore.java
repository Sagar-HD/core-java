class CapDataStore {
    Cap[] caps = new Cap[10];
    int index = 0;

    void save(Cap cap) {
        if (index < caps.length) {
            caps[index++] = cap;
            System.out.println("Cap saved");
        } else {
            System.out.println("Cap storage full");
        }
    }
}