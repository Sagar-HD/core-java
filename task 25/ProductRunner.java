public class ProductRunner {
    public static void main(String... args ){

        ProductStore store = new ProductStore();

        Product product1 = new Product("shoe","hrx","24-2-2026",870.5,
                Seller.AMAZON, WarrantyYears.ONE,false,1,"USA");
        store.save(product1);

        store.display();

        Product[] productsToAdd = {
            new Product("shoe","puma","24-2-2026",900,Seller.AMAZON,WarrantyYears.ONE,false,2,"USA"),
            new Product("shoe","adidas","24-2-2026",950,Seller.AMAZON,WarrantyYears.ONE,false,3,"USA"),
            new Product("shoe","nike","24-2-2026",1000,Seller.AMAZON,WarrantyYears.ONE,false,4,"USA"),
            new Product("shoe","one8","24-2-2026",850,Seller.AMAZON,WarrantyYears.ONE,false,5,"India")
        };
        store.save(productsToAdd);

        Product[] b1 = {
            new Product("watch","titan","01-03-2026",2500,Seller.FLIPKART,WarrantyYears.THREE,false,6,"India"),
            new Product("watch","fastrack","01-03-2026",1500,Seller.AMAZON,WarrantyYears.ONE,false,7,"India"),
            new Product("bag","wildcraft","01-03-2026",2000,Seller.AMAZON,WarrantyYears.TWO,false,8,"India"),
            new Product("bag","skybag","01-03-2026",1800,Seller.FLIPKART,WarrantyYears.TWO,false,9,"India"),
            new Product("phone","samsung","01-03-2026",20000,Seller.AMAZON,WarrantyYears.ONE,false,10,"Korea"),
            new Product("phone","apple","01-03-2026",80000,Seller.FLIPKART,WarrantyYears.ONE,false,11,"USA"),
            new Product("laptop","dell","01-03-2026",60000,Seller.AMAZON,WarrantyYears.THREE,false,12,"USA"),
            new Product("laptop","hp","01-03-2026",55000,Seller.FLIPKART,WarrantyYears.THREE,false,13,"USA"),
            new Product("laptop","lenovo","01-03-2026",50000,Seller.AMAZON,WarrantyYears.TWO,false,14,"China"),
            new Product("tv","sony","01-03-2026",70000,Seller.AMAZON,WarrantyYears.THREE,false,15,"Japan")
        };
        store.save(b1);

        Product[] b2 = {
            new Product("tv","lg","02-03-2026",65000,Seller.FLIPKART,WarrantyYears.THREE,false,16,"Korea"),
            new Product("tv","mi","02-03-2026",30000,Seller.AMAZON,WarrantyYears.ONE,false,17,"China"),
            new Product("tablet","ipad","02-03-2026",50000,Seller.FLIPKART,WarrantyYears.ONE,false,18,"USA"),
            new Product("tablet","samsung","02-03-2026",30000,Seller.AMAZON,WarrantyYears.ONE,false,19,"Korea"),
            new Product("headphone","boat","02-03-2026",2000,Seller.AMAZON,WarrantyYears.ONE,false,20,"India"),
            new Product("headphone","sony","02-03-2026",5000,Seller.FLIPKART,WarrantyYears.TWO,false,21,"Japan"),
            new Product("keyboard","logitech","02-03-2026",1500,Seller.AMAZON,WarrantyYears.ONE,false,22,"USA"),
            new Product("mouse","logitech","02-03-2026",800,Seller.FLIPKART,WarrantyYears.ONE,false,23,"USA"),
            new Product("monitor","samsung","02-03-2026",12000,Seller.AMAZON,WarrantyYears.TWO,false,24,"Korea"),
            new Product("monitor","lg","02-03-2026",14000,Seller.FLIPKART,WarrantyYears.TWO,false,25,"Korea")
        };
        store.save(b2);

        Product[] b3 = {
            new Product("shoe","reebok","03-03-2026",1200,Seller.AMAZON,WarrantyYears.ONE,false,26,"USA"),
            new Product("shoe","sparx","03-03-2026",900,Seller.FLIPKART,WarrantyYears.ONE,false,27,"India"),
            new Product("watch","casio","03-03-2026",3000,Seller.AMAZON,WarrantyYears.TWO,false,28,"Japan"),
            new Product("bag","american tourister","03-03-2026",2500,Seller.FLIPKART,WarrantyYears.TWO,false,29,"USA"),
            new Product("phone","oneplus","03-03-2026",35000,Seller.AMAZON,WarrantyYears.ONE,false,30,"China"),
            new Product("phone","realme","03-03-2026",15000,Seller.FLIPKART,WarrantyYears.ONE,false,31,"China"),
            new Product("laptop","asus","03-03-2026",65000,Seller.AMAZON,WarrantyYears.THREE,false,32,"Taiwan"),
            new Product("laptop","acer","03-03-2026",50000,Seller.FLIPKART,WarrantyYears.THREE,false,33,"Taiwan"),
            new Product("tv","panasonic","03-03-2026",55000,Seller.AMAZON,WarrantyYears.THREE,false,34,"Japan"),
            new Product("tablet","lenovo","03-03-2026",20000,Seller.FLIPKART,WarrantyYears.ONE,false,35,"China")
        };
        store.save(b3);

        Product[] b4 = {
            new Product("headphone","jbl","04-03-2026",4000,Seller.AMAZON,WarrantyYears.ONE,false,36,"USA"),
            new Product("keyboard","hp","04-03-2026",1200,Seller.FLIPKART,WarrantyYears.ONE,false,37,"USA"),
            new Product("mouse","dell","04-03-2026",700,Seller.AMAZON,WarrantyYears.ONE,false,38,"USA"),
            new Product("monitor","acer","04-03-2026",11000,Seller.FLIPKART,WarrantyYears.TWO,false,39,"Taiwan"),
            new Product("shoe","bata","04-03-2026",800,Seller.AMAZON,WarrantyYears.ONE,false,40,"India"),
            new Product("shoe","woodland","04-03-2026",2500,Seller.FLIPKART,WarrantyYears.ONE,false,41,"India"),
            new Product("watch","rolex","04-03-2026",500000,Seller.AMAZON,WarrantyYears.THREE,false,42,"Switzerland"),
            new Product("bag","gucci","04-03-2026",100000,Seller.FLIPKART,WarrantyYears.TWO,false,43,"Italy"),
            new Product("phone","vivo","04-03-2026",20000,Seller.AMAZON,WarrantyYears.ONE,false,44,"China"),
            new Product("phone","oppo","04-03-2026",18000,Seller.FLIPKART,WarrantyYears.ONE,false,45,"China")
        };
        store.save(b4);

        Product[] b5 = {
            new Product("laptop","msi","05-03-2026",80000,Seller.AMAZON,WarrantyYears.THREE,false,46,"Taiwan"),
            new Product("laptop","apple","05-03-2026",120000,Seller.FLIPKART,WarrantyYears.THREE,false,47,"USA"),
            new Product("tv","tcl","05-03-2026",40000,Seller.AMAZON,WarrantyYears.TWO,false,48,"China"),
            new Product("tablet","xiaomi","05-03-2026",18000,Seller.FLIPKART,WarrantyYears.ONE,false,49,"China"),
            new Product("headphone","skullcandy","05-03-2026",3500,Seller.AMAZON,WarrantyYears.ONE,false,50,"USA"),
            new Product("keyboard","corsair","05-03-2026",5000,Seller.FLIPKART,WarrantyYears.TWO,false,51,"USA"),
            new Product("mouse","razer","05-03-2026",4500,Seller.AMAZON,WarrantyYears.TWO,false,52,"USA"),
            new Product("monitor","benq","05-03-2026",13000,Seller.FLIPKART,WarrantyYears.TWO,false,53,"Taiwan"),
            new Product("shoe","fila","05-03-2026",1500,Seller.AMAZON,WarrantyYears.ONE,false,54,"Italy"),
            new Product("shoe","under armour","05-03-2026",3000,Seller.FLIPKART,WarrantyYears.ONE,false,55,"USA")
        };
        store.save(b5);

        Product[] b6 = {
            new Product("watch","omega","06-03-2026",400000,Seller.AMAZON,WarrantyYears.THREE,false,56,"Switzerland"),
            new Product("bag","prada","06-03-2026",120000,Seller.FLIPKART,WarrantyYears.TWO,false,57,"Italy"),
            new Product("phone","pixel","06-03-2026",60000,Seller.AMAZON,WarrantyYears.ONE,false,58,"USA"),
            new Product("laptop","samsung","06-03-2026",70000,Seller.FLIPKART,WarrantyYears.THREE,false,59,"Korea"),
            new Product("tv","hisense","06-03-2026",35000,Seller.AMAZON,WarrantyYears.TWO,false,60,"China"),
            new Product("tablet","honor","06-03-2026",22000,Seller.FLIPKART,WarrantyYears.ONE,false,61,"China"),
            new Product("headphone","beats","06-03-2026",15000,Seller.AMAZON,WarrantyYears.ONE,false,62,"USA"),
            new Product("keyboard","redragon","06-03-2026",3000,Seller.FLIPKART,WarrantyYears.ONE,false,63,"China"),
            new Product("mouse","hp","06-03-2026",600,Seller.AMAZON,WarrantyYears.ONE,false,64,"USA"),
            new Product("monitor","dell","06-03-2026",15000,Seller.FLIPKART,WarrantyYears.TWO,false,65,"USA")
        };
        store.save(b6);

        Product[] b7 = {
            new Product("shoe","lee cooper","07-03-2026",2000,Seller.AMAZON,WarrantyYears.ONE,false,66,"UK"),
            new Product("shoe","red tape","07-03-2026",1800,Seller.FLIPKART,WarrantyYears.ONE,false,67,"India"),
            new Product("watch","fossil","07-03-2026",8000,Seller.AMAZON,WarrantyYears.TWO,false,68,"USA"),
            new Product("bag","lavie","07-03-2026",2500,Seller.FLIPKART,WarrantyYears.TWO,false,69,"India"),
            new Product("phone","motorola","07-03-2026",20000,Seller.AMAZON,WarrantyYears.ONE,false,70,"USA"),
            new Product("laptop","lg","07-03-2026",75000,Seller.FLIPKART,WarrantyYears.THREE,false,71,"Korea"),
            new Product("tv","vu","07-03-2026",30000,Seller.AMAZON,WarrantyYears.TWO,false,72,"India"),
            new Product("tablet","realme","07-03-2026",15000,Seller.FLIPKART,WarrantyYears.ONE,false,73,"China"),
            new Product("headphone","noise","07-03-2026",2500,Seller.AMAZON,WarrantyYears.ONE,false,74,"India"),
            new Product("keyboard","asus","07-03-2026",3500,Seller.FLIPKART,WarrantyYears.TWO,false,75,"Taiwan")
        };
        store.save(b7);

        Product[] b8 = {
            new Product("mouse","lenovo","08-03-2026",700,Seller.AMAZON,WarrantyYears.ONE,false,76,"China"),
            new Product("monitor","hp","08-03-2026",14000,Seller.FLIPKART,WarrantyYears.TWO,false,77,"USA"),
            new Product("shoe","clarks","08-03-2026",4000,Seller.AMAZON,WarrantyYears.ONE,false,78,"UK"),
            new Product("watch","seiko","08-03-2026",12000,Seller.FLIPKART,WarrantyYears.TWO,false,79,"Japan"),
            new Product("bag","caprese","08-03-2026",3000,Seller.AMAZON,WarrantyYears.TWO,false,80,"India"),
            new Product("phone","iqoo","08-03-2026",25000,Seller.FLIPKART,WarrantyYears.ONE,false,81,"China"),
            new Product("laptop","gigabyte","08-03-2026",85000,Seller.AMAZON,WarrantyYears.THREE,false,82,"Taiwan"),
            new Product("tv","sharp","08-03-2026",45000,Seller.FLIPKART,WarrantyYears.TWO,false,83,"Japan"),
            new Product("tablet","nokia","08-03-2026",20000,Seller.AMAZON,WarrantyYears.ONE,false,84,"Finland"),
            new Product("headphone","akg","08-03-2026",6000,Seller.FLIPKART,WarrantyYears.ONE,false,85,"Austria")
        };
        store.save(b8);

        Product[] b9 = {
            new Product("keyboard","cooler master","09-03-2026",4500,Seller.AMAZON,WarrantyYears.TWO,false,86,"Taiwan"),
            new Product("mouse","steelseries","09-03-2026",5000,Seller.FLIPKART,WarrantyYears.TWO,false,87,"Denmark"),
            new Product("monitor","msi","09-03-2026",20000,Seller.AMAZON,WarrantyYears.TWO,false,88,"Taiwan"),
            new Product("shoe","gucci","09-03-2026",50000,Seller.FLIPKART,WarrantyYears.ONE,false,89,"Italy"),
            new Product("watch","tag heuer","09-03-2026",300000,Seller.AMAZON,WarrantyYears.THREE,false,90,"Switzerland"),
            new Product("bag","armani","09-03-2026",80000,Seller.FLIPKART,WarrantyYears.TWO,false,91,"Italy"),
            new Product("phone","asus rog","09-03-2026",70000,Seller.AMAZON,WarrantyYears.ONE,false,92,"Taiwan"),
            new Product("laptop","razer","09-03-2026",150000,Seller.FLIPKART,WarrantyYears.THREE,false,93,"USA"),
            new Product("tv","philips","09-03-2026",50000,Seller.AMAZON,WarrantyYears.TWO,false,94,"Netherlands"),
            new Product("tablet","microsoft","09-03-2026",90000,Seller.FLIPKART,WarrantyYears.ONE,false,95,"USA")
        };
        store.save(b9);

        Product[] b10 = {
            new Product("headphone","bose","10-03-2026",20000,Seller.AMAZON,WarrantyYears.ONE,false,96,"USA"),
            new Product("keyboard","apple","10-03-2026",10000,Seller.FLIPKART,WarrantyYears.ONE,false,97,"USA"),
            new Product("mouse","apple","10-03-2026",8000,Seller.AMAZON,WarrantyYears.ONE,false,98,"USA"),
            new Product("monitor","apple","10-03-2026",120000,Seller.FLIPKART,WarrantyYears.TWO,false,99,"USA"),
            new Product("shoe","zara","10-03-2026",3000,Seller.AMAZON,WarrantyYears.ONE,false,100,"Spain"),
            new Product("watch","diesel","10-03-2026",15000,Seller.FLIPKART,WarrantyYears.TWO,false,101,"Italy"),
            new Product("bag","guess","10-03-2026",9000,Seller.AMAZON,WarrantyYears.TWO,false,102,"USA"),
            new Product("phone","nothing","10-03-2026",30000,Seller.FLIPKART,WarrantyYears.ONE,false,103,"UK"),
            new Product("laptop","alienware","10-03-2026",200000,Seller.AMAZON,WarrantyYears.THREE,false,104,"USA"),
            new Product("tv","oneplus","10-03-2026",45000,Seller.FLIPKART,WarrantyYears.TWO,false,105,"China")
        };
        store.save(b10);

        Product[] b11 = {
            new Product("tablet","amazon fire","11-03-2026",15000,Seller.AMAZON,WarrantyYears.ONE,false,106,"USA"),
            new Product("headphone","realme","11-03-2026",3000,Seller.FLIPKART,WarrantyYears.ONE,false,107,"China"),
            new Product("keyboard","lenovo","11-03-2026",2000,Seller.AMAZON,WarrantyYears.ONE,false,108,"China"),
            new Product("mouse","asus","11-03-2026",1500,Seller.FLIPKART,WarrantyYears.ONE,false,109,"Taiwan"),
            new Product("monitor","samsung","11-03-2026",18000,Seller.AMAZON,WarrantyYears.TWO,false,110,"Korea"),
            new Product("shoe","decathlon","11-03-2026",2500,Seller.FLIPKART,WarrantyYears.ONE,false,111,"France"),
            new Product("watch","timex","11-03-2026",5000,Seller.AMAZON,WarrantyYears.TWO,false,112,"USA"),
            new Product("bag","nike","11-03-2026",4000,Seller.FLIPKART,WarrantyYears.TWO,false,113,"USA"),
            new Product("phone","lava","11-03-2026",12000,Seller.AMAZON,WarrantyYears.ONE,false,114,"India"),
            new Product("laptop","infinix","11-03-2026",40000,Seller.FLIPKART,WarrantyYears.THREE,false,115,"China")
        };
        store.save(b11);

        Product[] b12 = {
            new Product("tv","blaupunkt","12-03-2026",30000,Seller.AMAZON,WarrantyYears.TWO,false,116,"Germany"),
            new Product("tablet","acer","12-03-2026",22000,Seller.FLIPKART,WarrantyYears.ONE,false,117,"Taiwan"),
            new Product("headphone","sony","12-03-2026",7000,Seller.AMAZON,WarrantyYears.ONE,false,118,"Japan"),
            new Product("keyboard","dell","12-03-2026",1800,Seller.FLIPKART,WarrantyYears.ONE,false,119,"USA"),
            new Product("mouse","logitech","12-03-2026",900,Seller.AMAZON,WarrantyYears.ONE,false,120,"USA"),
            new Product("monitor","lg","12-03-2026",20000,Seller.FLIPKART,WarrantyYears.TWO,false,121,"Korea"),
            new Product("shoe","puma pro","12-03-2026",2200,Seller.AMAZON,WarrantyYears.ONE,false,122,"Germany"),
            new Product("watch","citizen","12-03-2026",10000,Seller.FLIPKART,WarrantyYears.TWO,false,123,"Japan"),
            new Product("bag","reebok","12-03-2026",3500,Seller.AMAZON,WarrantyYears.TWO,false,124,"USA"),
            new Product("phone","micromax","12-03-2026",10000,Seller.FLIPKART,WarrantyYears.ONE,false,125,"India")
        };
        store.save(b12);

        Product[] b13 = {
            new Product("laptop","chuwi","13-03-2026",30000,Seller.AMAZON,WarrantyYears.THREE,false,126,"China"),
            new Product("tv","kodak","13-03-2026",28000,Seller.FLIPKART,WarrantyYears.TWO,false,127,"USA")
        };
        store.save(b13);

        store.display();

        boolean isFound = store.searchById(4);
        System.out.println("product found "+isFound);
        isFound = store.searchById(8);
        System.out.println("product found "+isFound);

        isFound = store.searchByUniqeIdAndName(4,"shoe");
        System.out.println("product found "+isFound);
        isFound = store.searchByUniqeIdAndName(5,"pen");
        System.out.println("product found "+isFound);

        isFound = store.searchByUniqeIdAndNameAndOriginCountry(5,"shoe","USA");
        System.out.println("product found "+isFound);
        isFound = store.searchByUniqeIdAndNameAndOriginCountry(5,"shoe","India");
        System.out.println("product found "+isFound);

        store.getAllOriginCountry();

        boolean WarrantyExpired = store.checkWarrantyExpiredByUniqueId(4);
        System.out.println("warranty expired : "+WarrantyExpired);
        WarrantyExpired = store.checkWarrantyExpiredByUniqueId(9);
        System.out.println("warranty expired : "+WarrantyExpired);

        store.getAllByType("shoe");
        store.getAllByWarrantyYears(WarrantyYears.ONE);
    }
}