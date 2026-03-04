class MainProgram{
    public static void main(String[] args){

        Hamper hamper1=new Hamper();
        Hamper hamper2=new Hamper();

        Dolphin dolphin1=new Dolphin();
        Dolphin dolphin2=new Dolphin();

        Bridge bridge1=new Bridge();
        Bridge bridge2=new Bridge();

        Penguin penguin1=new Penguin();
        Penguin penguin2=new Penguin();

        TennisBall ball1=new TennisBall();
        TennisBall ball2=new TennisBall();

        Mountain mountain1=new Mountain();
        Mountain mountain2=new Mountain();

        Flag flag1=new Flag();
        Flag flag2=new Flag();

        Missle missle1=new Missle();
        Missle missle2=new Missle();

        Money money1=new Money();
        Money money2=new Money();

        Resource resource1=new Resource();
        Resource resource2=new Resource();

        hamper1.openHamper();
        hamper2.cleanHamper();
        dolphin1.swim();
        dolphin2.jump();
        bridge1.buildBridge();
        bridge2.inspectBridge();
        penguin1.walk();
        penguin2.swim();
        ball1.bounce();
        ball2.roll();
        mountain1.showPeak();
        mountain2.showView();
        flag1.raiseFlag();
        flag2.lowerFlag();
        missle1.launchMissile();
        missle2.testMissile();
        money1.earnMoney();
        money2.saveMoney();
        resource1.collectResource();
        resource2.useResource();

        Hamper.showType();
        Dolphin.showSpecies();
        Bridge.showType();
        Penguin.showSpecies();
        TennisBall.showColor();
        Mountain.showType();
        Flag.showCountry();
        Missle.showType();
        Money.showCurrency();
        Resource.showType();
    }
}