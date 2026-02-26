class Zoo {

    String place;
    int animals;

    Zoo() {
        place = "City Zoo";
        animals = 40;
    }

    Zoo(String place) {
        this.place = place;
        animals = 60;
    }

    Zoo(String place, int animals) {
        this.place = place;
        this.animals = animals;
    }
}