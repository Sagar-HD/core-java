package com.xworkz.crud;

class Store {
    Toy[] toys = new Toy[10];
    Shop[] shops = new Shop[10];
    PanCard[] pans = new PanCard[10];
    Grocery[] groceries = new Grocery[10];
    Medical[] medicals = new Medical[10];

    int toyCount = 0, shopCount = 0, panCount = 0, groceryCount = 0, medicalCount = 0;

    void storeToy(Toy t) {
        if (t == null) return;
        if (toyCount < toys.length) {
            toys[toyCount] = t;
            toyCount++;
        } else {
            System.out.println("Toy storage full");
        }
    }

    Toy searchToy(int id) {
        for (int i = 0; i < toyCount; i++) {
            if (toys[i] != null && toys[i].id == id) return toys[i];
        }
        return null;
    }

    void updateToy(int id, String name) {
        for (int i = 0; i < toyCount; i++) {
            if (toys[i] != null && toys[i].id == id) {
                toys[i].name = name;
                return;
            }
        }
    }

    void storeShop(Shop s) {
        if (s == null) return;
        if (shopCount < shops.length) {
            shops[shopCount] = s;
            shopCount++;
        } else {
            System.out.println("Shop storage full");
        }
    }

    Shop searchShop(int id) {
        for (int i = 0; i < shopCount; i++) {
            if (shops[i] != null && shops[i].shopId == id) return shops[i];
        }
        return null;
    }

    void updateShop(int id, String name) {
        for (int i = 0; i < shopCount; i++) {
            if (shops[i] != null && shops[i].shopId == id) {
                shops[i].shopName = name;
                return;
            }
        }
    }

    void storePan(PanCard p) {
        if (p == null) return;
        if (panCount < pans.length) {
            pans[panCount] = p;
            panCount++;
        } else {
            System.out.println("Pan storage full");
        }
    }

    PanCard searchPan(String pan) {
        for (int i = 0; i < panCount; i++) {
            if (pans[i] != null && pans[i].panNumber.equals(pan)) return pans[i];
        }
        return null;
    }

    void updatePan(String pan, String name) {
        for (int i = 0; i < panCount; i++) {
            if (pans[i] != null && pans[i].panNumber.equals(pan)) {
                pans[i].holderName = name;
                return;
            }
        }
    }

    void storeGrocery(Grocery g) {
        if (g == null) return;
        if (groceryCount < groceries.length) {
            groceries[groceryCount] = g;
            groceryCount++;
        } else {
            System.out.println("Grocery storage full");
        }
    }

    Grocery searchGrocery(int id) {
        for (int i = 0; i < groceryCount; i++) {
            if (groceries[i] != null && groceries[i].itemId == id) return groceries[i];
        }
        return null;
    }

    void updateGrocery(int id, String name) {
        for (int i = 0; i < groceryCount; i++) {
            if (groceries[i] != null && groceries[i].itemId == id) {
                groceries[i].itemName = name;
                return;
            }
        }
    }

    void storeMedical(Medical m) {
        if (m == null) return;
        if (medicalCount < medicals.length) {
            medicals[medicalCount] = m;
            medicalCount++;
        } else {
            System.out.println("Medical storage full");
        }
    }

    Medical searchMedical(int id) {
        for (int i = 0; i < medicalCount; i++) {
            if (medicals[i] != null && medicals[i].medicineId == id) return medicals[i];
        }
        return null;
    }

    void updateMedical(int id, String name) {
        for (int i = 0; i < medicalCount; i++) {
            if (medicals[i] != null && medicals[i].medicineId == id) {
                medicals[i].name = name;
                return;
            }
        }
    }
}