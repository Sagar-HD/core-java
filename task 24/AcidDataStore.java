class AcidDataStore {
    Acid[] data = new Acid[10];
    int index = 0;

    void save(Acid obj) {
        if (obj == null) {
            System.out.println("Acid cannot be saved: null object");
            return;
        }
        if (index >= data.length) {
            System.out.println("Acid storage is full");
            return;
        }
        data[index] = obj;
        System.out.println("Acid saved at index: " + index);
        index++;
    }
}