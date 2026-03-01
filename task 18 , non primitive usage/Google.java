class Google {
    String founder, ceo, headquarters, searchEngine, emailService,
           cloudService, operatingSystem, videoPlatform, mapService, browser,
           aiTool, revenueModel, launchYear, employees, slogan,
           parentCompany, stockSymbol, assistant, driveService, adsPlatform;

    Google(String founder,String ceo,String headquarters,String searchEngine,String emailService,
           String cloudService,String operatingSystem,String videoPlatform,String mapService,String browser,
           String aiTool,String revenueModel,String launchYear,String employees,String slogan,
           String parentCompany,String stockSymbol,String assistant,String driveService,String adsPlatform){
        this.founder=founder; this.ceo=ceo; this.headquarters=headquarters; this.searchEngine=searchEngine; this.emailService=emailService;
        this.cloudService=cloudService; this.operatingSystem=operatingSystem; this.videoPlatform=videoPlatform; this.mapService=mapService; this.browser=browser;
        this.aiTool=aiTool; this.revenueModel=revenueModel; this.launchYear=launchYear; this.employees=employees; this.slogan=slogan;
        this.parentCompany=parentCompany; this.stockSymbol=stockSymbol; this.assistant=assistant; this.driveService=driveService; this.adsPlatform=adsPlatform;
    }

    void display(){
        System.out.println(founder+" "+ceo+" "+headquarters+" "+searchEngine+" "+emailService+" "+cloudService+" "+operatingSystem+" "+videoPlatform+" "+mapService+" "+browser+" "+aiTool+" "+revenueModel+" "+launchYear+" "+employees+" "+slogan+" "+parentCompany+" "+stockSymbol+" "+assistant+" "+driveService+" "+adsPlatform);
    }
}