class MapDataStore {
    Map[] maps = new Map[10];
    int index = 0;

    void save(Map map) {
        if (index < maps.length) {
            maps[index++] = map;
            System.out.println("Map saved");
        } else {
            System.out.println("Map storage full");
        }
    }
}