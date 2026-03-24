class FestivalDataStore {
    Festival[] festivals = new Festival[10];
    int index = 0;

    void save(Festival festival) {
        if (index < festivals.length) {
            festivals[index++] = festival;
            System.out.println("Festival saved");
        } else {
            System.out.println("Festival storage full");
        }
    }
}