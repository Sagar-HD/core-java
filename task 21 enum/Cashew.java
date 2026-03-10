public class Cashew {

    int quantity;
    String origin;
    CashewSize size;

    public Cashew(int quantity, String origin, CashewSize size) {
        this.quantity = quantity;
        this.origin = origin;
        this.size = size;
    }

    public void printInfo() {
        if(origin != null && size != null) {
            System.out.println(quantity + " " + origin + " " + size);
        }
    }
}