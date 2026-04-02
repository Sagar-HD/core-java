class Runner {
    public static void main(String[] args) {
        Guitar obj1 = new Guitar("Guitar", 6, "String");
        ConcertStage st1 = new ConcertStage("Main Stage", 5000, "NY");
        ModernStairCase sc1 = new ModernStairCase(20, "Wood", "Spiral");
        SocialMediaReel rl1 = new SocialMediaReel("Instagram", 30, "Alex");
        Skyscraper b1 = new Skyscraper("Tower A", 10, "LA");
        FarmChicken c1 = new FarmChicken("Broiler", 2, "White");
        DairyButter bt1 = new DairyButter("Amul", 500, "Salted");
        StreetShaavarma sh1 = new StreetShaavarma("Chicken", "Garlic", 120);
        GiantBlueWhale bw1 = new GiantBlueWhale("Pacific", 30, "Krill");
        PetGermanShepherd gs1 = new PetGermanShepherd("Max", 5, "Brown");

        Guitar obj2 = new Guitar("Violin", 4, "String");
        ConcertStage st2 = new ConcertStage("Mini Stage", 1000, "London");
        ModernStairCase sc2 = new ModernStairCase(15, "Steel", "Straight");
        SocialMediaReel rl2 = new SocialMediaReel("YouTube", 60, "John");
        Skyscraper b2 = new Skyscraper("Skyline", 20, "Dubai");
        FarmChicken c2 = new FarmChicken("Desi", 3, "Brown");
        DairyButter bt2 = new DairyButter("Nestle", 250, "Unsalted");
        StreetShaavarma sh2 = new StreetShaavarma("Mutton", "Spicy", 150);
        GiantBlueWhale bw2 = new GiantBlueWhale("Atlantic", 28, "Fish");
        PetGermanShepherd gs2 = new PetGermanShepherd("Rocky", 4, "Black");

        Guitar obj3 = new Guitar("Piano", 88, "Keyboard");
        ConcertStage st3 = new ConcertStage("Grand Stage", 8000, "Paris");
        ModernStairCase sc3 = new ModernStairCase(25, "Marble", "Curved");
        SocialMediaReel rl3 = new SocialMediaReel("TikTok", 45, "Emma");
        Skyscraper b3 = new Skyscraper("Empire", 50, "NY");
        FarmChicken c3 = new FarmChicken("Layer", 2, "Golden");
        DairyButter bt3 = new DairyButter("Britannia", 400, "Salted");
        StreetShaavarma sh3 = new StreetShaavarma("Veg", "Mint", 100);
        GiantBlueWhale bw3 = new GiantBlueWhale("Indian", 32, "Plankton");
        PetGermanShepherd gs3 = new PetGermanShepherd("Leo", 3, "Grey");

        System.out.println(obj1.instrumentName + " " + st1.stageName + " " + sc1.totalSteps + " " + rl1.platformName + " " + b1.buildingName + " " + c1.breedType + " " + bt1.brandName + " " + sh1.fillingType + " " + bw1.oceanName + " " + gs1.dogName);

        System.out.println(obj2.instrumentName + " " + st2.stageName + " " + sc2.totalSteps + " " + rl2.platformName + " " + b2.buildingName + " " + c2.breedType + " " + bt2.brandName + " " + sh2.fillingType + " " + bw2.oceanName + " " + gs2.dogName);

        System.out.println(obj3.instrumentName + " " + st3.stageName + " " + sc3.totalSteps + " " + rl3.platformName + " " + b3.buildingName + " " + c3.breedType + " " + bt3.brandName + " " + sh3.fillingType + " " + bw3.oceanName + " " + gs3.dogName);
    }
}