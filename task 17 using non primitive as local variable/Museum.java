class Museum {

    String name;
    int ticketPrice;

    Museum() {
        name = "Local Museum";
        ticketPrice = 50;
    }

    Museum(String name) {
        this.name = name;
        ticketPrice = 80;
    }

    Museum(String name, int ticketPrice) {
        this.name = name;
        this.ticketPrice = ticketPrice;
    }
}