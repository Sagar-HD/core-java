class TollgateDataStore {
    Tollgate[] data = new Tollgate[10];
    int index = 0;

    void save(Tollgate obj) {
        if (obj == null) {
            System.out.println("Tollgate cannot be saved: null object");
            return;
        }
        if (index >= data.length) {
            System.out.println("Tollgate storage is full");
            return;
        }
        data[index] = obj;
        System.out.println("Tollgate saved at index: " + index);
        index++;
    }
}