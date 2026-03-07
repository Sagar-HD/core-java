class Ingredient {
    String name;
    int quantity;

    Ingredient(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    void displayInfo() {
        System.out.println("Ingredient Name: " + name);
        System.out.println("Quantity: " + quantity);
    }
}

class Cup {
    String material;
    double capacity;

    Cup(String material, double capacity) {
        this.material = material;
        this.capacity = capacity;
    }

    void displayInfo() {
        System.out.println("Cup Material: " + material);
        System.out.println("Cup Capacity: " + capacity);
    }
}

class Brand {
    String name;
    String origin;

    Brand(String name, String origin) {
        this.name = name;
        this.origin = origin;
    }

    void displayInfo() {
        System.out.println("Brand Name: " + name);
        System.out.println("Origin: " + origin);
    }
}

class Temperature {
    int degree;
    String level;

    Temperature(int degree, String level) {
        this.degree = degree;
        this.level = level;
    }

    void displayInfo() {
        System.out.println("Temperature: " + degree);
        System.out.println("Level: " + level);
    }
}

class Sweetener {
    String type;
    int spoons;

    Sweetener(String type, int spoons) {
        this.type = type;
        this.spoons = spoons;
    }

    void displayInfo() {
        System.out.println("Sweetener Type: " + type);
        System.out.println("Spoons: " + spoons);
    }
}

class Tea {

    int teaId;
    double price;
    boolean hot;
    char size;
    float rating;

    Ingredient ingredient;
    Cup cup;
    Brand brand;
    Temperature temperature;
    Sweetener sweetener;

    Tea(int teaId, double price, boolean hot, char size, float rating,
        Ingredient ingredient, Cup cup, Brand brand,
        Temperature temperature, Sweetener sweetener) {

        this.teaId = teaId;
        this.price = price;
        this.hot = hot;
        this.size = size;
        this.rating = rating;

        this.ingredient = ingredient;
        this.cup = cup;
        this.brand = brand;
        this.temperature = temperature;
        this.sweetener = sweetener;
    }

    void displayInfo() {
        System.out.println("Tea ID: " + teaId);
        System.out.println("Price: " + price);
        System.out.println("Hot: " + hot);
        System.out.println("Size: " + size);
        System.out.println("Rating: " + rating);

        ingredient.displayInfo();
        cup.displayInfo();
        brand.displayInfo();
        temperature.displayInfo();
        sweetener.displayInfo();
    }
}

public class TeaRunner {

    public static void main(String[] args) {

        Ingredient ingredient = new Ingredient("Tea Leaves", 2);
        Cup cup = new Cup("Ceramic", 250);
        Brand brand = new Brand("Tata Tea", "India");
        Temperature temperature = new Temperature(90, "Hot");
        Sweetener sweetener = new Sweetener("Sugar", 2);

        Tea tea = new Tea(1, 25.5, true, 'M', 4.5f,
                ingredient, cup, brand, temperature, sweetener);

        tea.displayInfo();
    }
}