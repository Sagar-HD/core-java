class ChessBoard {
    String material;
    int size;
    String color;
    boolean foldable;
    double price;

    ChessBoard() {}

    ChessBoard(String material) {
        this.material = material;
    }

    ChessBoard(String material, int size) {
        this.material = material;
        this.size = size;
    }

    ChessBoard(String material, int size, String color) {
        this.material = material;
        this.size = size;
        this.color = color;
    }

    ChessBoard(String material, int size, String color, boolean foldable) {
        this.material = material;
        this.size = size;
        this.color = color;
        this.foldable = foldable;
    }

    ChessBoard(String material, int size, String color, boolean foldable, double price) {
        this.material = material;
        this.size = size;
        this.color = color;
        this.foldable = foldable;
        this.price = price;
    }

    void display() {
        System.out.println(material + " " + size + " " + color + " " + foldable + " " + price);
    }
}