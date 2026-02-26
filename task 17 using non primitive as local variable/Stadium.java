class Stadium {

    String name;
    int capacity;

    Stadium() {
        name = "Main Stadium";
        capacity = 10000;
    }

    Stadium(String name) {
        this.name = name;
        capacity = 20000;
    }

    Stadium(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}