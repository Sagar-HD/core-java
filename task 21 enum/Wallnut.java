public class Wallnut {

    int quantity;
    String origin;
    WallnutGrade grade;

    public Wallnut(int quantity, String origin, WallnutGrade grade) {
        this.quantity = quantity;
        this.origin = origin;
        this.grade = grade;
    }

    public void printInfo() {
        if(origin != null && grade != null) {
            System.out.println(quantity + " " + origin + " " + grade);
        }
    }
}