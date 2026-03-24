class Acid {
    String name;
    String formula;
    double concentration;
    String type;
    double pH;
    boolean strong;

    Acid(String name, String formula, double concentration, String type, double pH, boolean strong) {
        this.name = name;
        this.formula = formula;
        this.concentration = concentration;
        this.type = type;
        this.pH = pH;
        this.strong = strong;
    }
}