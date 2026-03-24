class ClothDataStore {
    Cloth[] data = new Cloth[10];
    int index = 0;

    void save(Cloth obj) {
        if (obj == null) {
            System.out.println("Cloth cannot be saved: null object");
            return;
        }
        if (index >= data.length) {
            System.out.println("Cloth storage is full");
            return;
        }
        data[index] = obj;
        System.out.println("Cloth saved at index: " + index);
        index++;
    }
}