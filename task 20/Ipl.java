public class Team {
    String name;
    int players;

    public Team(String name, int players) {
        this.name = name;
        this.players = players;
    }
}
public class Stadium {
    String name;
    int capacity;

    public Stadium(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}
public class Player {
    String name;
    int jersey;

    public Player(String name, int jersey) {
        this.name = name;
        this.jersey = jersey;
    }
}
public class Trophy {
    String title;
    int year;

    public Trophy(String title, int year) {
        this.title = title;
        this.year = year;
    }
}
public class Sponsor {
    String company;
    double amount;

    public Sponsor(String company, double amount) {
        this.company = company;
        this.amount = amount;
    }
}
public class Ipl {

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

    public Ipl(int seasons, double revenue, boolean active, char grade, String organizer,
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
}