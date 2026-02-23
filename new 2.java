class Fiber {
    String name;
    double length;
    String vendors;
}

class Labour {
    String name;
    double salary;
    String idProofs;
}

class AirConditioner {
    String brand, model, type, colors, working;
    double price, weight;
    int warranty;
}

class Bread {
    String type;
    String[] outletNames;
    String[] ingredients;
    String shape;
}

class Bun {
    String name, flavor, size, brand, expiryDate;
    double price, weight;
    int quantity, calories;
    boolean fresh;
    String[] ingredients;
    String[] stores;
}

class PenDrive {
    String brand, color, type, material, interfaceType;
    int capacity, warrantyYears, readSpeed, writeSpeed, quantity;
    double price, weight;
    boolean waterproof, encrypted, compatible;
    String country, model, serialNumber, packaging, shape;
    String[] supportedOS;
    String[] certifications;
    String[] availableStores;
}

class HappyDent {
    String name, flavor, brand, color, shape, packagingType;
    String manufacturer, country, expiryDate, mfgDate;
    int quantity, calories, sugarLevel, rating, stock;
    double price, weight;
    boolean sugarFree, glutenFree, available;
    String code, batchNumber, qualityGrade, category;
    String texture, size, targetAudience, storageType;
    String promotion, ingredientsInfo, distributor;
    String[] ingredients;
    String[] availableStores;
}

public class Main {
    public static void main(String[] args) {

        Fiber f1 = new Fiber();
        f1.name = "OpticX";
        f1.length = 100.5;
        f1.vendors = "VendorA";

        Fibre f2 = new Fiber();
        f2.name = "FiberPro";
        f2.length = 200.0;
        f2.vendors = "VendorB";

        Bread b1 = new Bread();
        b1.type = "Wheat";
        b1.shape = "Oval";

        String[] outlets1 = {"Outlet1","Outlet2"};
        outlets1 = new String[]{"Outlet1","Outlet2"};
        b1.outletNames = outlets1;

        String[] ing1 = {"Flour","Yeast"};
        ing1 = new String[]{"Flour","Yeast"};
        b1.ingredients = ing1;

        Bun bun1 = new Bun();
        bun1.name = "SweetBun";
        bun1.flavor = "Chocolate";
        bun1.size = "Medium";
        bun1.brand = "BakeCo";
        bun1.expiryDate = "12-12-2026";
        bun1.price = 20;
        bun1.weight = 0.2;
        bun1.quantity = 10;
        bun1.calories = 150;
        bun1.fresh = true;

        String[] bunIng = {"Flour","Sugar"};
        bunIng = new String[]{"Flour","Sugar"};
        bun1.ingredients = bunIng;

        String[] bunStores = {"Store1","Store2"};
        bunStores = new String[]{"Store1","Store2"};
        bun1.stores = bunStores;

        PenDrive p1 = new PenDrive();
        p1.brand = "HP";
        p1.color = "Black";
        p1.type = "USB 3.0";
        p1.material = "Plastic";
        p1.interfaceType = "Type-A";
        p1.capacity = 64;
        p1.warrantyYears = 2;
        p1.readSpeed = 150;
        p1.writeSpeed = 100;
        p1.quantity = 50;
        p1.price = 800;
        p1.weight = 0.05;
        p1.waterproof = true;
        p1.encrypted = true;
        p1.compatible = true;
        p1.country = "India";
        p1.model = "HP64";
        p1.serialNumber = "SN123";
        p1.packaging = "Box";
        p1.shape = "Rectangular";

        String[] os = {"Windows","Mac"};
        os = new String[]{"Windows","Mac"};
        p1.supportedOS = os;

        String[] cert = {"ISO"};
        cert = new String[]{"ISO"};
        p1.certifications = cert;

        String[] stores = {"Amazon","Flipkart"};
        stores = new String[]{"Amazon","Flipkart"};
        p1.availableStores = stores;

        HappyDent h1 = new HappyDent();
        h1.name = "HappyDent";
        h1.flavor = "Mint";
        h1.brand = "Perfetti";
        h1.color = "White";
        h1.shape = "Stick";
        h1.packagingType = "Wrapper";
        h1.manufacturer = "Perfetti Ltd";
        h1.country = "India";
        h1.expiryDate = "12-2026";
        h1.mfgDate = "01-2025";
        h1.quantity = 20;
        h1.calories = 50;
        h1.sugarLevel = 5;
        h1.rating = 4;
        h1.stock = 100;
        h1.price = 10;
        h1.weight = 0.02;
        h1.sugarFree = true;
        h1.glutenFree = true;
        h1.available = true;
        h1.code = "HD01";
        h1.batchNumber = "B123";
        h1.qualityGrade = "A";
        h1.category = "Chewing Gum";
        h1.texture = "Soft";
        h1.size = "Small";
        h1.targetAudience = "All";
        h1.storageType = "Cool";
        h1.promotion = "Offer";
        h1.ingredientsInfo = "Mint Extract";
        h1.distributor = "Distributor1";

        String[] gumIng = {"Mint","Sugar"};
        gumIng = new String[]{"Mint","Sugar"};
        h1.ingredients = gumIng;

        String[] gumStores = {"Store1","Store2"};
        gumStores = new String[]{"Store1","Store2"};
        h1.availableStores = gumStores;
    }
}