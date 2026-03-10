public class Napkin {

    int pieces;
    String brand;
    NapkinMaterial material;

    public Napkin(int pieces, String brand, NapkinMaterial material) {
        this.pieces = pieces;
        this.brand = brand;
        this.material = material;
    }

    public void printInfo() {
        if(brand != null && material != null) {
            System.out.println(pieces + " " + brand + " " + material);
        }
    }
}