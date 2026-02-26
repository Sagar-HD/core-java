public class Runner {

    public static void main(String[] args) {

        MuseumCreator.create();
        MuseumCreator.create("History");
        MuseumCreator.create("Art", 120);

        ZooCreator.create();
        ZooCreator.create("Mysore");
        ZooCreator.create("Bannerghatta", 90);

        StadiumCreator.create();
        StadiumCreator.create("Chinnaswamy");
        StadiumCreator.create("Olympic", 50000);
    }
}