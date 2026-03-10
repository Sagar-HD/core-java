public class Fort {

    int age;
    String name;
    FortStyle style;

    public Fort(int age, String name, FortStyle style) {
        this.age = age;
        this.name = name;
        this.style = style;
    }

    public void printInfo() {
        if(name != null && style != null) {
            System.out.println(age + " " + name + " " + style);
        }
    }
}