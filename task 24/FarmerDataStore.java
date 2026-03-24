class FarmerDataStore {
    Farmer[] data = new Farmer[10];
    int index = 0;

    void save(Farmer obj) {
        if (obj == null) {
            System.out.println("Farmer cannot be saved: null object");
            return;
        }
        if (index >= data.length) {
            System.out.println("Farmer storage is full");
            return;
        }
        data[index] = obj;
        System.out.println("Farmer saved at index: " + index);
        index++;
    }
}