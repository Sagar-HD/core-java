class Scanner {

    String[] models;
    Scanner[] scanners;

    Scanner(String[] models, Scanner[] scanners){
        this.models = models;
        this.scanners = scanners;
    }

    void info(){

        System.out.println("Scanner Info");

        for(String m : models){
            System.out.println(m);
        }

        if(scanners != null){
            System.out.println("Scanner Objects: " + scanners.length);
        }
    }
}