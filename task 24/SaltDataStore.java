class SaltDataStore {
    Salt[] data = new Salt[10];
    int index = 0;

    void save(Salt obj) {
        if (obj == null) {
            System.out.println("Salt cannot be saved: null object");
            return;
        }
        if (index >= data.length) {
            System.out.println("Salt storage is full");
            return;
        }
        data[index] = obj;
        System.out.println("Salt saved at index: " + index);
        index++;
    }
}