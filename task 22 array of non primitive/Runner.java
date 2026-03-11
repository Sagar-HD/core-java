class Runner {

    public static void main(String[] args) {

        String[] printerBrands = {"HP","Canon","Epson"};
        Printer[] printers = new Printer[3];
        printers[0] = new Printer(printerBrands, printers);
        printers[1] = new Printer(printerBrands, printers);
        printers[2] = new Printer(printerBrands, printers);
        printers[0].info();


        String[] painterColors = {"Red","Blue","Green"};
        Painter[] painters = new Painter[3];
        painters[0] = new Painter(painterColors,painters);
        painters[1] = new Painter(painterColors,painters);
        painters[2] = new Painter(painterColors,painters);
        painters[0].info();


        int[] tools = {1,2,3};
        Carpenter[] carpenters = new Carpenter[3];
        carpenters[0] = new Carpenter(tools,carpenters);
        carpenters[1] = new Carpenter(tools,carpenters);
        carpenters[2] = new Carpenter(tools,carpenters);
        carpenters[0].info();


        String[] serverNames = {"Apache","Nginx","Tomcat"};
        Server[] servers = new Server[3];
        servers[0] = new Server(serverNames,servers);
        servers[1] = new Server(serverNames,servers);
        servers[2] = new Server(serverNames,servers);
        servers[0].info();


        String[] jokes = {"Joke1","Joke2","Joke3"};
        Joker[] jokers = new Joker[3];
        jokers[0] = new Joker(jokes,jokers);
        jokers[1] = new Joker(jokes,jokers);
        jokers[2] = new Joker(jokes,jokers);
        jokers[0].info();


        String[] models = {"ScanA","ScanB","ScanC"};
        Scanner[] scanners = new Scanner[3];
        scanners[0] = new Scanner(models,scanners);
        scanners[1] = new Scanner(models,scanners);
        scanners[2] = new Scanner(models,scanners);
        scanners[0].info();


        String[] companies = {"Share1","Share2","Share3"};
        Broker[] brokers = new Broker[3];
        brokers[0] = new Broker(companies,brokers);
        brokers[1] = new Broker(companies,brokers);
        brokers[2] = new Broker(companies,brokers);
        brokers[0].info();


        int[] weights = {5,10,15};
        Hammer[] hammers = new Hammer[3];
        hammers[0] = new Hammer(weights,hammers);
        hammers[1] = new Hammer(weights,hammers);
        hammers[2] = new Hammer(weights,hammers);
        hammers[0].info();


        String[] flavors = {"Classic","Mini","Special"};
        Jamoon[] jamoons = new Jamoon[3];
        jamoons[0] = new Jamoon(flavors,jamoons);
        jamoons[1] = new Jamoon(flavors,jamoons);
        jamoons[2] = new Jamoon(flavors,jamoons);
        jamoons[0].info();


        String[] texts = {"Sale","Welcome","Offer"};
        Banner[] banners = new Banner[3];
        banners[0] = new Banner(texts,banners);
        banners[1] = new Banner(texts,banners);
        banners[2] = new Banner(texts,banners);
        banners[0].info();


        String[] ingredients = {"Carrot","Milk","Sugar"};
        CarrotHalwa[] halwas = new CarrotHalwa[3];
        halwas[0] = new CarrotHalwa(ingredients,halwas);
        halwas[1] = new CarrotHalwa(ingredients,halwas);
        halwas[2] = new CarrotHalwa(ingredients,halwas);
        halwas[0].info();


        int[] heights = {100,200,300};
        Tower[] towers = new Tower[3];
        towers[0] = new Tower(heights,towers);
        towers[1] = new Tower(heights,towers);
        towers[2] = new Tower(heights,towers);
        towers[0].info();

    }
}