class GumDataStore {
    Gum[] data = new Gum[10];
    int index = 0;

    void save(Gum obj) {
        if (obj == null) {
            System.out.println("Gum cannot be saved: null object");
            return;
        }
        if (index >= data.length) {
            System.out.println("Gum storage is full");
            return;
        }
        data[index] = obj;
        System.out.println("Gum saved at index: " + index);
        index++;
    }
}