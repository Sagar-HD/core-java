class Team {
    String name;
    int players;

    Team(String name, int players) {
        this.name = name;
        this.players = players;
    }

    void displayInfo() {
        System.out.println("Team Name: " + name);
        System.out.println("Number of Players: " + players);
    }
}

class Stadium {
    String name;
    int capacity;

    Stadium(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    void displayInfo() {
        System.out.println("Stadium Name: " + name);
        System.out.println("Capacity: " + capacity);
    }
}

class Player {
    String name;
    int jersey;

    Player(String name, int jersey) {
        this.name = name;
        this.jersey = jersey;
    }

    void displayInfo() {
        System.out.println("Player Name: " + name);
        System.out.println("Jersey Number: " + jersey);
    }
}

class Trophy {
    String title;
    int year;

    Trophy(String title, int year) {
        this.title = title;
        this.year = year;
    }

    void displayInfo() {
        System.out.println("Trophy Title: " + title);
        System.out.println("Year Won: " + year);
    }
}

class Sponsor {
    String company;
    double amount;

    Sponsor(String company, double amount) {
        this.company = company;
        this.amount = amount;
    }

    void displayInfo() {
        System.out.println("Sponsor Company: " + company);
        System.out.println("Sponsorship Amount: " + amount);
    }
}

class Ipl {

    int seasons;
    double revenue;
    boolean active;
    char grade;
    String organizer;

    Team team;
    Stadium stadium;
    Player player;
    Trophy trophy;
    Sponsor sponsor;

    Ipl(int seasons, double revenue, boolean active, char grade, String organizer,
        Team team, Stadium stadium, Player player, Trophy trophy, Sponsor sponsor) {

        this.seasons = seasons;
        this.revenue = revenue;
        this.active = active;
        this.grade = grade;
        this.organizer = organizer;

        this.team = team;
        this.stadium = stadium;
        this.player = player;
        this.trophy = trophy;
        this.sponsor = sponsor;
    }

    void displayInfo() {
        System.out.println("Seasons: " + seasons);
        System.out.println("Revenue: " + revenue);
        System.out.println("Active: " + active);
        System.out.println("Grade: " + grade);
        System.out.println("Organizer: " + organizer);

        team.displayInfo();
        stadium.displayInfo();
        player.displayInfo();
        trophy.displayInfo();
        sponsor.displayInfo();
    }
}

public class IplRunner {

    public static void main(String[] args) {

        Team team = new Team("RCB", 11);
        Stadium stadium = new Stadium("Chinnaswamy", 40000);
        Player player = new Player("Virat Kohli", 18);
        Trophy trophy = new Trophy("IPL Trophy", 2023);
        Sponsor sponsor = new Sponsor("Tata", 5000000);

        Ipl ipl = new Ipl(16, 1200.5, true, 'A', "BCCI",
                team, stadium, player, trophy, sponsor);

        ipl.displayInfo();
    }
}