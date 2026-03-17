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

        pasta.delete("Macaroni");
        pasta.delete("Penne");
        pasta.delete(9);
        pasta.delete(3);


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

        petroleumCompany.delete("Shell");
        petroleumCompany.delete("HP");
        petroleumCompany.delete(5);
        petroleumCompany.delete(7);


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

        singer.delete("KK");
        singer.delete("Arijit Singh");
        singer.delete(2);
        singer.delete(6);


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

        tree.delete("Neem");
        tree.delete("Mango");
        tree.delete(8);
        tree.delete(7);


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

        steel.delete("SAIL");
        steel.delete("JSW Steel");
        steel.delete(0);
        steel.delete(6);


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

        kettle.delete("Prestige");
        kettle.delete("Philips");
        kettle.delete(4);
        kettle.delete(9);


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

        turbine.delete("Wind Turbine");
        turbine.delete("Gas Turbine");
        turbine.delete(1);
        turbine.delete(6);


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

        scooter.delete("Activa");
        scooter.delete("Jupiter");
        scooter.delete(2);
        scooter.delete(9);

    }
}