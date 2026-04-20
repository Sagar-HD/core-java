package com.xworkz.equals;
public class Runner {
    public static void main(String[] args) {

        Wire wire1 = new Wire("Copper",10,"Red");
        Wire wire2 = new Wire("Copper",10,"Red");
        System.out.println(wire1.equals(wire2));

        WaterMelon melon1 = new WaterMelon("India",5.5,"Sweet");
        WaterMelon melon2 = new WaterMelon("India",5.5,"Sweet");
        System.out.println(melon1.equals(melon2));

        Crown crown1 = new Crown("Royal","Gold",50000);
        Crown crown2 = new Crown("Royal","Gold",50000);
        System.out.println(crown1.equals(crown2));

        Industry industry1 = new Industry("Tata","Steel",5000);
        Industry industry2 = new Industry("Tata","Steel",5000);
        System.out.println(industry1.equals(industry2));

        Oil oil1 = new Oil("Shell","Engine",2);
        Oil oil2 = new Oil("Shell","Engine",2);
        System.out.println(oil1.equals(oil2));

        ToothPaste paste1 = new ToothPaste("Colgate","Mint",200);
        ToothPaste paste2 = new ToothPaste("Colgate","Mint",200);
        System.out.println(paste1.equals(paste2));

        Diamond diamond1 = new Diamond("Round",2.5,"VVS1");
        Diamond diamond2 = new Diamond("Round",2.5,"VVS1");
        System.out.println(diamond1.equals(diamond2));

        Fork fork1 = new Fork("Steel",4,"Medium");
        Fork fork2 = new Fork("Steel",4,"Medium");
        System.out.println(fork1.equals(fork2));

        Trolley trolley1 = new Trolley("VIP",4,35);
        Trolley trolley2 = new Trolley("VIP",4,35);
        System.out.println(trolley1.equals(trolley2));

        Sim sim1 = new Sim("Jio","5G",9876543210L);
        Sim sim2 = new Sim("Jio","5G",9876543210L);
        System.out.println(sim1.equals(sim2));

        Battery battery1 = new Battery("Duracell",5000,"Li-ion");
        Battery battery2 = new Battery("Duracell",5000,"Li-ion");
        System.out.println(battery1.equals(battery2));
    }
}