class SambarDataStore {
    Sambar[] data = new Sambar[10];
    int index = 0;

    void save(Sambar obj) {
        if (obj == null) {
            System.out.println("Sambar cannot be saved: null object");
            return;
        }
        if (index >= data.length) {
            System.out.println("Sambar storage is full");
            return;
        }
        data[index] = obj;
        System.out.println("Sambar saved at index: " + index);
        index++;
    }
}