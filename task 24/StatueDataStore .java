class StatueDataStore {
    Statue[] data = new Statue[10];
    int index = 0;

    void save(Statue obj) {
        if (obj == null) {
            System.out.println("Statue cannot be saved: null object");
            return;
        }
        if (index >= data.length) {
            System.out.println("Statue storage is full");
            return;
        }
        data[index] = obj;
        System.out.println("Statue saved at index: " + index);
        index++;
    }
}