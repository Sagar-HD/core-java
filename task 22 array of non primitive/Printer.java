class Printer {

    String[] names;
    Printer[] printers;

    Printer(String[] names, Printer[] printers) {
        this.names = names;
        this.printers = printers;
    }

    void info() {
        System.out.println("Printing String array:");
        for (String n : names) {
            System.out.println(n);
        }

        System.out.println("Printing Printer object array:");
        if (printers != null) {
            for (Printer p : printers) {
                if (p != null)
                    System.out.println(p);
            }
        }
    }
}