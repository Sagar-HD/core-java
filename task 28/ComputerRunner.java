public class ComputerRunner {
    public static void main(String[] args) {
        Computer comp = new Computer();

        Browser b1 = new Browser();
        ChromeBrowser b2 = new ChromeBrowser();
        MobileChromeBrowser b3 = new MobileChromeBrowser();


        comp.install(b1);

  
        comp.install(b2);

        
        comp.install(b3);
    }
}