class Runner{

    public static void main(String[] args){

        Pasta pasta=new Pasta();
        pasta.save("Penne");
        pasta.save("Spaghetti");
        pasta.save("Macaroni");
        pasta.save("Fusilli");
        pasta.save("Rigatoni");
        pasta.save("Farfalle");
        pasta.save("Linguine");
        pasta.save("Ravioli");
        pasta.save("Tortellini");
        pasta.save("Lasagna");

        System.out.println("Pasta search "+pasta.search("Macaroni"));
        System.out.println("Pasta search "+pasta.search("Penne"));
        System.out.println("Pasta search "+pasta.search("Lasagna"));
        System.out.println("Pasta search "+pasta.search("Fusilli"));


        PetroleumCompany petroleumCompany=new PetroleumCompany();
        petroleumCompany.save("HP");
        petroleumCompany.save("Shell");
        petroleumCompany.save("Indian Oil");
        petroleumCompany.save("Bharat Petroleum");
        petroleumCompany.save("Nayara");
        petroleumCompany.save("Reliance");
        petroleumCompany.save("Essar");
        petroleumCompany.save("Total");
        petroleumCompany.save("Gulf");
        petroleumCompany.save("ONGC");

        System.out.println("Petroleum search "+petroleumCompany.search("Shell"));
        System.out.println("Petroleum search "+petroleumCompany.search("HP"));
        System.out.println("Petroleum search "+petroleumCompany.search("Reliance"));
        System.out.println("Petroleum search "+petroleumCompany.search("Total"));


        Singer singer=new Singer();
        singer.save("Arijit Singh");
        singer.save("Sonu Nigam");
        singer.save("Shreya Ghoshal");
        singer.save("KK");
        singer.save("Atif Aslam");
        singer.save("Armaan Malik");
        singer.save("Neha Kakkar");
        singer.save("Jubin Nautiyal");
        singer.save("Sunidhi Chauhan");
        singer.save("Mohit Chauhan");

        System.out.println("Singer search "+singer.search("KK"));
        System.out.println("Singer search "+singer.search("Arijit Singh"));
        System.out.println("Singer search "+singer.search("Sonu Nigam"));
        System.out.println("Singer search "+singer.search("Neha Kakkar"));


        Tree tree=new Tree();
        tree.save("Neem");
        tree.save("Banyan");
        tree.save("Peepal");
        tree.save("Mango");
        tree.save("Coconut");
        tree.save("Teak");
        tree.save("Sandalwood");
        tree.save("Pine");
        tree.save("Oak");
        tree.save("Maple");

        System.out.println("Tree search "+tree.search("Neem"));
        System.out.println("Tree search "+tree.search("Mango"));
        System.out.println("Tree search "+tree.search("Oak"));
        System.out.println("Tree search "+tree.search("Pine"));


        Steel steel=new Steel();
        steel.save("Tata Steel");
        steel.save("JSW Steel");
        steel.save("SAIL");
        steel.save("Jindal Steel");
        steel.save("Essar Steel");
        steel.save("Bhushan Steel");
        steel.save("RINL");
        steel.save("Vizag Steel");
        steel.save("Kalyani Steel");
        steel.save("AMNS Steel");

        System.out.println("Steel search "+steel.search("SAIL"));
        System.out.println("Steel search "+steel.search("JSW Steel"));
        System.out.println("Steel search "+steel.search("Tata Steel"));
        System.out.println("Steel search "+steel.search("RINL"));


        Kettle kettle=new Kettle();
        kettle.save("Prestige");
        kettle.save("Pigeon");
        kettle.save("Butterfly");
        kettle.save("Philips");
        kettle.save("Bajaj");
        kettle.save("Havells");
        kettle.save("Morphy Richards");
        kettle.save("Usha");
        kettle.save("Orpat");
        kettle.save("Milton");

        System.out.println("Kettle search "+kettle.search("Prestige"));
        System.out.println("Kettle search "+kettle.search("Philips"));
        System.out.println("Kettle search "+kettle.search("Bajaj"));
        System.out.println("Kettle search "+kettle.search("Milton"));


        Turbine turbine=new Turbine();
        turbine.save("Gas Turbine");
        turbine.save("Steam Turbine");
        turbine.save("Wind Turbine");
        turbine.save("Hydraulic Turbine");
        turbine.save("Impulse Turbine");
        turbine.save("Reaction Turbine");
        turbine.save("Pelton Turbine");
        turbine.save("Kaplan Turbine");
        turbine.save("Francis Turbine");
        turbine.save("Micro Turbine");

        System.out.println("Turbine search "+turbine.search("Wind Turbine"));
        System.out.println("Turbine search "+turbine.search("Gas Turbine"));
        System.out.println("Turbine search "+turbine.search("Steam Turbine"));
        System.out.println("Turbine search "+turbine.search("Pelton Turbine"));


        Scooter scooter=new Scooter();
        scooter.save("Activa");
        scooter.save("Jupiter");
        scooter.save("Access");
        scooter.save("Ntorq");
        scooter.save("Ray Z");
        scooter.save("Fascino");
        scooter.save("Pleasure");
        scooter.save("Maestro");
        scooter.save("Aerox");
        scooter.save("Burgman");

        System.out.println("Scooter search "+scooter.search("Activa"));
        System.out.println("Scooter search "+scooter.search("Jupiter"));
        System.out.println("Scooter search "+scooter.search("Access"));
        System.out.println("Scooter search "+scooter.search("Burgman"));

    }
}