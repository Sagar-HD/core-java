public class Runner {
    public static void main(String[] args) {

        Droplet d1 = new Droplet();
        Droplet d2 = new Droplet("Clear");
        Droplet d3 = new Droplet("Blue", 1.2);
        Droplet d4 = new Droplet("Red", 2.1, "Round");
        Droplet d5 = new Droplet("Green", 2.3, "Oval", true);
        Droplet d6 = new Droplet("Silver", 3.0, "Sphere", true, 25);
        d1.display(); d2.display(); d3.display(); d4.display(); d5.display(); d6.display();

        Umbrella u1 = new Umbrella();
        Umbrella u2 = new Umbrella("WildCraft");
        Umbrella u3 = new Umbrella("Puma", "Black");
        Umbrella u4 = new Umbrella("Nike", "Blue", 42);
        Umbrella u5 = new Umbrella("Adidas", "Red", 40, true);
        Umbrella u6 = new Umbrella("Skyline", "Grey", 38, false, 799);
        u1.display(); u2.display(); u3.display(); u4.display(); u5.display(); u6.display();

        Rain r1 = new Rain();
        Rain r2 = new Rain("Drizzle");
        Rain r3 = new Rain("Heavy", 8.5);
        Rain r4 = new Rain("Storm", 10.2, "City");
        Rain r5 = new Rain("Monsoon", 12.3, "Village", true);
        Rain r6 = new Rain("Shower", 5.5, "Town", false, 60);
        r1.display(); r2.display(); r3.display(); r4.display(); r5.display(); r6.display();

        Snow s1 = new Snow();
        Snow s2 = new Snow("Powder");
        Snow s3 = new Snow("Wet", 4.5);
        Snow s4 = new Snow("Dry", 3.2, "Hill");
        Snow s5 = new Snow("Blizzard", 8.1, "Peak", false);
        Snow s6 = new Snow("Soft", 2.5, "Valley", true, -5);
        s1.display(); s2.display(); s3.display(); s4.display(); s5.display(); s6.display();

        HairDryer h1 = new HairDryer();
        HairDryer h2 = new HairDryer("Philips");
        HairDryer h3 = new HairDryer("Nova", 1200);
        HairDryer h4 = new HairDryer("Vega", 1500, "Black");
        HairDryer h5 = new HairDryer("Panasonic", 1800, "White", true);
        HairDryer h6 = new HairDryer("Syska", 2000, "Red", true, 2499);
        h1.display(); h2.display(); h3.display(); h4.display(); h5.display(); h6.display();

        Clip c1 = new Clip();
        Clip c2 = new Clip("Steel");
        Clip c3 = new Clip("Plastic", "Red");
        Clip c4 = new Clip("Metal", "Blue", 5.5);
        Clip c5 = new Clip("Iron", "Green", 6.2, true);
        Clip c6 = new Clip("Copper", "Black", 4.8, false, 10);
        c1.display(); c2.display(); c3.display(); c4.display(); c5.display(); c6.display();

        ChessBoard cb1 = new ChessBoard();
        ChessBoard cb2 = new ChessBoard("Wood");
        ChessBoard cb3 = new ChessBoard("Plastic", 8);
        ChessBoard cb4 = new ChessBoard("Marble", 10, "Brown");
        ChessBoard cb5 = new ChessBoard("Glass", 12, "White", true);
        ChessBoard cb6 = new ChessBoard("Wood", 8, "Black", false, 2999);
        cb1.display(); cb2.display(); cb3.display(); cb4.display(); cb5.display(); cb6.display();

        Track t1 = new Track();
        Track t2 = new Track("Olympic");
        Track t3 = new Track("Sprint", 400);
        Track t4 = new Track("Marathon", 5000, "City");
        Track t5 = new Track("Training", 200, "School", true);
        Track t6 = new Track("Pro", 800, "Stadium", false, 45.6);
        t1.display(); t2.display(); t3.display(); t4.display(); t5.display(); t6.display();

        Battery b1 = new Battery();
        Battery b2 = new Battery("Duracell");
        Battery b3 = new Battery("Eveready", 3000);
        Battery b4 = new Battery("Sony", 2500, "Li-ion");
        Battery b5 = new Battery("Panasonic", 4000, "NiMH", true);
        Battery b6 = new Battery("Exide", 5000, "Li-ion", true, 1299);
        b1.display(); b2.display(); b3.display(); b4.display(); b5.display(); b6.display();

        Pawn p1 = new Pawn();
        Pawn p2 = new Pawn("White");
        Pawn p3 = new Pawn("Black", "Wood");
        Pawn p4 = new Pawn("White", "Plastic", 3.5);
        Pawn p5 = new Pawn("Black", "Marble", 4.0, false);
        Pawn p6 = new Pawn("White", "Wood", 3.8, true, 1);
        p1.display(); p2.display(); p3.display(); p4.display(); p5.display(); p6.display();

        Carrom cr1 = new Carrom();
        Carrom cr2 = new Carrom("Wood");
        Carrom cr3 = new Carrom("Plywood", 29);
        Carrom cr4 = new Carrom("Wood", 32, "Brown");
        Carrom cr5 = new Carrom("Glass", 30, "White", true);
        Carrom cr6 = new Carrom("Wood", 28, "Black", true, 4999);
        cr1.display(); cr2.display(); cr3.display(); cr4.display(); cr5.display(); cr6.display();

        Strawberry st1 = new Strawberry();
        Strawberry st2 = new Strawberry("Albion");
        Strawberry st3 = new Strawberry("Camarosa", "Red");
        Strawberry st4 = new Strawberry("Sweet Charlie", "Dark Red", 15);
        Strawberry st5 = new Strawberry("Festival", "Bright Red", 18, true);
        Strawberry st6 = new Strawberry("Winter Dawn", "Red", 20, false, 250);
        st1.display(); st2.display(); st3.display(); st4.display(); st5.display(); st6.display();
    }
}