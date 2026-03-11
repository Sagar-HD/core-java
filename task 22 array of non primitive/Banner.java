class Banner {

    String[] texts;
    Banner[] banners;

    Banner(String[] texts, Banner[] banners){
        this.texts = texts;
        this.banners = banners;
    }

    void info(){

        System.out.println("Banner Info");

        for(String t : texts){
            System.out.println(t);
        }

        if(banners != null){
            System.out.println("Banner Objects: " + banners.length);
        }
    }
}