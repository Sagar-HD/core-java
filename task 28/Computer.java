
class Computer {
    void install(Browser browser) {
        System.out.println("Installing browser...");

        browser.browse();

       
        if (browser instanceof MobileChromeBrowser) {
            MobileChromeBrowser m = (MobileChromeBrowser) browser;
            m.mobileFeature();
        } 
        else if (browser instanceof ChromeBrowser) {
            ChromeBrowser c = (ChromeBrowser) browser;
            c.chromeFeature();
        } 
        else {
            System.out.println("Basic browser installed");
        }
    }
}