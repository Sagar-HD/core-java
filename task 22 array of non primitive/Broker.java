class Broker {

    String[] companies;
    Broker[] brokers;

    Broker(String[] companies, Broker[] brokers){
        this.companies = companies;
        this.brokers = brokers;
    }

    void info(){

        System.out.println("Broker Info");

        for(String c : companies){
            System.out.println(c);
        }

        if(brokers != null){
            System.out.println("Broker Objects: " + brokers.length);
        }
    }
}