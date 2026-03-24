class ProfileDataStore {
    Profile[] data = new Profile[10];
    int index = 0;

    void save(Profile obj) {
        if (obj == null) {
            System.out.println("Profile cannot be saved: null object");
            return;
        }
        if (index >= data.length) {
            System.out.println("Profile storage is full");
            return;
        }
        data[index] = obj;
        System.out.println("Profile saved at index: " + index);
        index++;
    }
}