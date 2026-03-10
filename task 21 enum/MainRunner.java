public class MainRunner {

    public static void main(String[] args) {

        Parliament p1 = new Parliament(545,"Delhi",ParliamentType.LOKSABHA);
        Parliament p2 = new Parliament(250,"Delhi",ParliamentType.RAJYASABHA);
        Parliament p3 = new Parliament(600,"Delhi",ParliamentType.JOINT_SESSION);
        Parliament p4 = new Parliament(300,"Delhi",ParliamentType.SPECIAL_SESSION);

        p1.printInfo();
        p2.printInfo();
        p3.printInfo();
        p4.printInfo();


        Court c1 = new Court(10,"Bangalore",CourtLevel.DISTRICT);
        Court c2 = new Court(20,"Mumbai",CourtLevel.HIGH);
        Court c3 = new Court(30,"Delhi",CourtLevel.SUPREME);
        Court c4 = new Court(5,"Chennai",CourtLevel.FAMILY);

        c1.printInfo();
        c2.printInfo();
        c3.printInfo();
        c4.printInfo();


        DMart d1 = new DMart(100,"Whitefield",DMartSection.GROCERY);
        DMart d2 = new DMart(80,"Indiranagar",DMartSection.CLOTHING);
        DMart d3 = new DMart(60,"BTM",DMartSection.ELECTRONICS);
        DMart d4 = new DMart(90,"Marathahalli",DMartSection.HOME);

        d1.printInfo();
        d2.printInfo();
        d3.printInfo();
        d4.printInfo();


        Fort f1 = new Fort(500,"RedFort",FortStyle.STONE);
        Fort f2 = new Fort(700,"Golconda",FortStyle.HILL);
        Fort f3 = new Fort(300,"SeaFort",FortStyle.SEA);
        Fort f4 = new Fort(600,"Jaisalmer",FortStyle.DESERT);

        f1.printInfo();
        f2.printInfo();
        f3.printInfo();
        f4.printInfo();


        Napkin n1 = new Napkin(50,"Softy",NapkinMaterial.PAPER);
        Napkin n2 = new Napkin(40,"CleanWrap",NapkinMaterial.COTTON);
        Napkin n3 = new Napkin(60,"EcoNap",NapkinMaterial.LINEN);
        Napkin n4 = new Napkin(30,"GreenCare",NapkinMaterial.BAMBOO);

        n1.printInfo();
        n2.printInfo();
        n3.printInfo();
        n4.printInfo();


        Pumpkin pu1 = new Pumpkin(5,"Orange",PumpkinVariety.SUGAR);
        Pumpkin pu2 = new Pumpkin(7,"Orange",PumpkinVariety.CINDERELLA);
        Pumpkin pu3 = new Pumpkin(6,"Yellow",PumpkinVariety.PIE);
        Pumpkin pu4 = new Pumpkin(10,"Green",PumpkinVariety.ATLANTIC);

        pu1.printInfo();
        pu2.printInfo();
        pu3.printInfo();
        pu4.printInfo();


        Calendar ca1 = new Calendar(2024,"Classmate",CalendarType.WALL);
        Calendar ca2 = new Calendar(2025,"Navneet",CalendarType.DESK);
        Calendar ca3 = new Calendar(2026,"DigitalCo",CalendarType.DIGITAL);
        Calendar ca4 = new Calendar(2023,"MiniBook",CalendarType.POCKET);

        ca1.printInfo();
        ca2.printInfo();
        ca3.printInfo();
        ca4.printInfo();


        Horlicks h1 = new Horlicks(500,"Horlicks",HorlicksFlavor.CLASSIC);
        Horlicks h2 = new Horlicks(750,"Horlicks",HorlicksFlavor.CHOCOLATE);
        Horlicks h3 = new Horlicks(400,"Horlicks",HorlicksFlavor.VANILLA);
        Horlicks h4 = new Horlicks(600,"Horlicks",HorlicksFlavor.MALT);

        h1.printInfo();
        h2.printInfo();
        h3.printInfo();
        h4.printInfo();


        Wallnut w1 = new Wallnut(10,"Kashmir",WallnutGrade.A);
        Wallnut w2 = new Wallnut(20,"Iran",WallnutGrade.B);
        Wallnut w3 = new Wallnut(15,"USA",WallnutGrade.C);
        Wallnut w4 = new Wallnut(25,"Chile",WallnutGrade.PREMIUM);

        w1.printInfo();
        w2.printInfo();
        w3.printInfo();
        w4.printInfo();


        Cashew cs1 = new Cashew(5,"Goa",CashewSize.SMALL);
        Cashew cs2 = new Cashew(10,"Kerala",CashewSize.MEDIUM);
        Cashew cs3 = new Cashew(15,"Mangalore",CashewSize.LARGE);
        Cashew cs4 = new Cashew(20,"Goa",CashewSize.EXTRA);

        cs1.printInfo();
        cs2.printInfo();
        cs3.printInfo();
        cs4.printInfo();


        Paneer pa1 = new Paneer(200,"Amul",PaneerType.FRESH);
        Paneer pa2 = new Paneer(250,"Nandini",PaneerType.MALAI);
        Paneer pa3 = new Paneer(300,"MilkyMist",PaneerType.LOW_FAT);
        Paneer pa4 = new Paneer(350,"OrganicFarm",PaneerType.ORGANIC);

        pa1.printInfo();
        pa2.printInfo();
        pa3.printInfo();
        pa4.printInfo();


        Mushroom m1 = new Mushroom(1,"White",MushroomVariety.BUTTON);
        Mushroom m2 = new Mushroom(2,"Brown",MushroomVariety.OYSTER);
        Mushroom m3 = new Mushroom(3,"Dark",MushroomVariety.SHIITAKE);
        Mushroom m4 = new Mushroom(4,"Large",MushroomVariety.PORTOBELLO);

        m1.printInfo();
        m2.printInfo();
        m3.printInfo();
        m4.printInfo();


        Beer b1 = new Beer(330,"Kingfisher",BeerType.LAGER);
        Beer b2 = new Beer(500,"Budweiser",BeerType.ALE);
        Beer b3 = new Beer(650,"Guinness",BeerType.STOUT);
        Beer b4 = new Beer(330,"Heineken",BeerType.PILSNER);

        b1.printInfo();
        b2.printInfo();
        b3.printInfo();
        b4.printInfo();
    }
}