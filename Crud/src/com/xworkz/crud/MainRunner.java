package com.xworkz.crud;

public class MainRunner {
    public static void main(String[] args) {

        Store store = new Store();

        Toy t1 = new Toy();
        t1.id = 1;
        t1.name = "Car";
        t1.brand = "HotWheels";
        t1.price = 150;
        t1.ageGroup = 5;

        Toy t2 = new Toy();
        t2.id = 2;
        t2.name = "Doll";
        t2.brand = "Barbie";
        t2.price = 300;
        t2.ageGroup = 6;

        store.storeToy(t1);
        store.storeToy(t2);

        Shop s1 = new Shop();
        s1.shopId = 1;
        s1.shopName = "ABC Store";
        s1.location = "Chennai";
        s1.owner = "Raj";
        s1.revenue = 50000;

        store.storeShop(s1);

        PanCard p1 = new PanCard();
        p1.panNumber = "ABCDE1234F";
        p1.holderName = "Arun";
        p1.age = 30;
        p1.address = "Chennai";
        p1.dob = "01-01-1995";

        store.storePan(p1);

        Grocery g1 = new Grocery();
        g1.itemId = 1;
        g1.itemName = "Rice";
        g1.price = 60;
        g1.quantity = 10;
        g1.category = "Food";

        store.storeGrocery(g1);

        Medical m1 = new Medical();
        m1.medicineId = 1;
        m1.name = "Paracetamol";
        m1.manufacturer = "ABC Pharma";
        m1.price = 20;
        m1.expiryDate = "12-2026";

        store.storeMedical(m1);

        System.out.println("Toy Search:");
        Toy toyResult = store.searchToy(1);
        if (toyResult != null) toyResult.displayInfo();

        System.out.println("Toy Update:");
        store.updateToy(1, "Racing Car");
        store.searchToy(1).displayInfo();

        System.out.println("Shop Search:");
        Shop shopResult = store.searchShop(1);
        if (shopResult != null) shopResult.displayInfo();

        System.out.println("Pan Search:");
        PanCard panResult = store.searchPan("ABCDE1234F");
        if (panResult != null) panResult.displayInfo();

        System.out.println("Grocery Search:");
        Grocery groceryResult = store.searchGrocery(1);
        if (groceryResult != null) groceryResult.displayInfo();

        System.out.println("Medical Search:");
        Medical medicalResult = store.searchMedical(1);
        if (medicalResult != null) medicalResult.displayInfo();

        System.out.println("Medical Update:");
        store.updateMedical(1, "Dolo 650");
        store.searchMedical(1).displayInfo();
    }
}