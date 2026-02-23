public class Main {
    public static void main(String[] args) {

        Fiber f1 = new Fiber();
        f1.name = "OpticX";
        f1.length = 100.5;
        f1.vendors = "VendorA";

        Fiber f2 = new Fiber();
        f2.name = "FiberPro";
        f2.length = 200.0;
        f2.vendors = "VendorB";

        System.out.println("Fiber 1: " + f1.name + ", " + f1.length + ", " + f1.vendors);
        System.out.println("Fiber 2: " + f2.name + ", " + f2.length + ", " + f2.vendors);


        Bread b1 = new Bread();
        b1.type = "Wheat";
        b1.shape = "Oval";

        String[] outlets1 = {"Outlet1", "Outlet2"};
        outlets1 = new String[]{"Outlet1", "Outlet2"};
        b1.outletNames = outlets1;

        String[] ing1 = {"Flour", "Yeast"};
        ing1 = new String[]{"Flour", "Yeast"};
        b1.ingredients = ing1;

        System.out.println("\nBread:");
        System.out.println("Type: " + b1.type);
        System.out.println("Shape: " + b1.shape);
        System.out.println("Outlets:");
        for (String s : b1.outletNames) {
            System.out.println(s);
        }
        System.out.println("Ingredients:");
        for (String s : b1.ingredients) {
            System.out.println(s);
        }


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

        String[] bunIng = {"Flour", "Sugar"};
        bunIng = new String[]{"Flour", "Sugar"};
        bun1.ingredients = bunIng;

        String[] bunStores = {"Store1", "Store2"};
        bunStores = new String[]{"Store1", "Store2"};
        bun1.stores = bunStores;

        System.out.println("\nBun:");
        System.out.println("Name: " + bun1.name);
        System.out.println("Flavor: " + bun1.flavor);
        System.out.println("Size: " + bun1.size);
        System.out.println("Brand: " + bun1.brand);
        System.out.println("Expiry: " + bun1.expiryDate);
        System.out.println("Price: " + bun1.price);
        System.out.println("Weight: " + bun1.weight);
        System.out.println("Quantity: " + bun1.quantity);
        System.out.println("Calories: " + bun1.calories);
        System.out.println("Fresh: " + bun1.fresh);
        System.out.println("Ingredients:");
        for (String s : bun1.ingredients) {
            System.out.println(s);
        }
        System.out.println("Available Stores:");
        for (String s : bun1.stores) {
            System.out.println(s);
        }


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

        String[] os = {"Windows", "Mac"};
        os = new String[]{"Windows", "Mac"};
        p1.supportedOS = os;

        String[] cert = {"ISO"};
        cert = new String[]{"ISO"};
        p1.certifications = cert;

        String[] stores = {"Amazon", "Flipkart"};
        stores = new String[]{"Amazon", "Flipkart"};
        p1.availableStores = stores;

        System.out.println("\nPenDrive:");
        System.out.println("Brand: " + p1.brand);
        System.out.println("Color: " + p1.color);
        System.out.println("Type: " + p1.type);
        System.out.println("Material: " + p1.material);
        System.out.println("Interface: " + p1.interfaceType);
        System.out.println("Capacity: " + p1.capacity + "GB");
        System.out.println("Warranty: " + p1.warrantyYears + " years");
        System.out.println("Read Speed: " + p1.readSpeed);
        System.out.println("Write Speed: " + p1.writeSpeed);
        System.out.println("Quantity: " + p1.quantity);
        System.out.println("Price: " + p1.price);
        System.out.println("Weight: " + p1.weight);
        System.out.println("Waterproof: " + p1.waterproof);
        System.out.println("Encrypted: " + p1.encrypted);
        System.out.println("Compatible: " + p1.compatible);
        System.out.println("Country: " + p1.country);
        System.out.println("Model: " + p1.model);
        System.out.println("Serial: " + p1.serialNumber);
        System.out.println("Packaging: " + p1.packaging);
        System.out.println("Shape: " + p1.shape);

        System.out.println("Supported OS:");
        for (String s : p1.supportedOS) {
            System.out.println(s);
        }

        System.out.println("Certifications:");
        for (String s : p1.certifications) {
            System.out.println(s);
        }

        System.out.println("Available Stores:");
        for (String s : p1.availableStores) {
            System.out.println(s);
        }


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

        String[] gumIng = {"Mint", "Sugar"};
        gumIng = new String[]{"Mint", "Sugar"};
        h1.ingredients = gumIng;

        String[] gumStores = {"Store1", "Store2"};
        gumStores = new String[]{"Store1", "Store2"};
        h1.availableStores = gumStores;

        System.out.println("\nHappyDent:");
        System.out.println("Name: " + h1.name);
        System.out.println("Flavor: " + h1.flavor);
        System.out.println("Brand: " + h1.brand);
        System.out.println("Color: " + h1.color);
        System.out.println("Shape: " + h1.shape);
        System.out.println("Packaging: " + h1.packagingType);
        System.out.println("Manufacturer: " + h1.manufacturer);
        System.out.println("Country: " + h1.country);
        System.out.println("Expiry: " + h1.expiryDate);
        System.out.println("MFG Date: " + h1.mfgDate);
        System.out.println("Quantity: " + h1.quantity);
        System.out.println("Calories: " + h1.calories);
        System.out.println("Sugar Level: " + h1.sugarLevel);
        System.out.println("Rating: " + h1.rating);
        System.out.println("Stock: " + h1.stock);
        System.out.println("Price: " + h1.price);
        System.out.println("Weight: " + h1.weight);
        System.out.println("Sugar Free: " + h1.sugarFree);
        System.out.println("Gluten Free: " + h1.glutenFree);
        System.out.println("Available: " + h1.available);
        System.out.println("Code: " + h1.code);
        System.out.println("Batch: " + h1.batchNumber);
        System.out.println("Grade: " + h1.qualityGrade);
        System.out.println("Category: " + h1.category);
        System.out.println("Texture: " + h1.texture);
        System.out.println("Size: " + h1.size);
        System.out.println("Target: " + h1.targetAudience);
        System.out.println("Storage: " + h1.storageType);
        System.out.println("Promotion: " + h1.promotion);
        System.out.println("Ingredient Info: " + h1.ingredientsInfo);
        System.out.println("Distributor: " + h1.distributor);

        System.out.println("Ingredients:");
        for (String s : h1.ingredients) {
            System.out.println(s);
        }

        System.out.println("Available Stores:");
        for (String s : h1.availableStores) {
            System.out.println(s);
        }
    }
}