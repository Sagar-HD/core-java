class CloudSoftwareDataStore {
    CloudSoftware[] data = new CloudSoftware[10];
    int index = 0;

    void save(CloudSoftware obj) {
        if (obj == null) {
            System.out.println("CloudSoftware cannot be saved: null object");
            return;
        }
        if (index >= data.length) {
            System.out.println("CloudSoftware storage is full");
            return;
        }
        data[index] = obj;
        System.out.println("CloudSoftware saved at index: " + index);
        index++;
    }
}