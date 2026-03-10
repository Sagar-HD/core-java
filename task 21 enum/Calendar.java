public class Calendar {

    int year;
    String brand;
    CalendarType type;

    public Calendar(int year, String brand, CalendarType type) {
        this.year = year;
        this.brand = brand;
        this.type = type;
    }

    public void printInfo() {
        if(brand != null && type != null) {
            System.out.println(year + " " + brand + " " + type);
        }
    }
}