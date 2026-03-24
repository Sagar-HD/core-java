public class MainRunner {
    public static void main(String[] args) {

        CapDataStore capStore = new CapDataStore();
        MapDataStore mapStore = new MapDataStore();
        FestivalDataStore festivalStore = new FestivalDataStore();
        ClothDataStore clothStore = new ClothDataStore();
        ProfileDataStore profileStore = new ProfileDataStore();
        StatueDataStore statueStore = new StatueDataStore();
        TollgateDataStore tollgateStore = new TollgateDataStore();
        GumDataStore gumStore = new GumDataStore();
        CloudSoftwareDataStore cloudStore = new CloudSoftwareDataStore();
        FarmerDataStore farmerStore = new FarmerDataStore();
        AcidDataStore acidStore = new AcidDataStore();
        SaltDataStore saltStore = new SaltDataStore();
        SambarDataStore sambarStore = new SambarDataStore();

        capStore.save(new Cap("Nike","Black","M",500,"Cotton",true));
        capStore.save(new Cap("Puma","Red","L",600,"Wool",false));
        capStore.save(new Cap("Adidas","Blue","S",450,"Cotton",true));
        capStore.save(new Cap("Reebok","White","M",550,"Poly",true));
        capStore.save(new Cap("Fila","Green","L",400,"Cotton",false));
        capStore.save(new Cap("HRX","Grey","M",350,"Poly",true));
        capStore.save(new Cap("Zara","Brown","S",700,"Wool",false));
        capStore.save(new Cap("H&M","Black","L",300,"Cotton",true));
        capStore.save(new Cap("Gucci","Gold","M",2000,"Silk",false));
        capStore.save(new Cap("Levis","Blue","S",650,"Denim",true));

        mapStore.save(new Map("India","Political",1.5,"NCERT",2022,true));
        mapStore.save(new Map("World","Physical",2.0,"Oxford",2021,false));
        mapStore.save(new Map("Asia","Geo",1.2,"Atlas",2020,true));
        mapStore.save(new Map("Europe","Political",1.8,"Pearson",2019,false));
        mapStore.save(new Map("Africa","Physical",2.2,"Atlas",2021,true));
        mapStore.save(new Map("USA","Road",1.1,"Rand",2023,true));
        mapStore.save(new Map("UK","City",1.0,"BBC",2022,false));
        mapStore.save(new Map("Australia","Geo",1.7,"Atlas",2020,true));
        mapStore.save(new Map("Japan","City",1.3,"TokyoPub",2023,true));
        mapStore.save(new Map("China","Political",1.9,"Gov",2022,false));

        festivalStore.save(new Festival("Diwali","India","Nov",5,"Religious",true));
        festivalStore.save(new Festival("Holi","India","Mar",2,"Cultural",true));
        festivalStore.save(new Festival("Christmas","Global","Dec",1,"Religious",true));
        festivalStore.save(new Festival("Eid","Global","Apr",1,"Religious",true));
        festivalStore.save(new Festival("Pongal","India","Jan",4,"Harvest",true));
        festivalStore.save(new Festival("Onam","India","Aug",10,"Cultural",true));
        festivalStore.save(new Festival("Navratri","India","Oct",9,"Religious",true));
        festivalStore.save(new Festival("Durga Puja","India","Oct",5,"Religious",true));
        festivalStore.save(new Festival("Baisakhi","India","Apr",1,"Harvest",true));
        festivalStore.save(new Festival("Lohri","India","Jan",1,"Cultural",false));

        clothStore.save(new Cloth("Shirt","Cotton","White","Zara",1500,"M"));
        clothStore.save(new Cloth("Tshirt","Poly","Black","H&M",800,"L"));
        clothStore.save(new Cloth("Jeans","Denim","Blue","Levis",2000,"M"));
        clothStore.save(new Cloth("Jacket","Leather","Brown","Roadster",3000,"L"));
        clothStore.save(new Cloth("Kurta","Cotton","Green","FabIndia",1200,"M"));
        clothStore.save(new Cloth("Saree","Silk","Red","Biba",2500,"Free"));
        clothStore.save(new Cloth("Shorts","Cotton","Grey","Nike",900,"M"));
        clothStore.save(new Cloth("Blazer","Wool","Black","AllenSolly",3500,"L"));
        clothStore.save(new Cloth("Hoodie","Fleece","Blue","Puma",1800,"M"));
        clothStore.save(new Cloth("Tracks","Poly","Black","Adidas",1600,"L"));

        profileStore.save(new Profile("Aman",21,"a@mail.com","111","Bangalore","Student"));
        profileStore.save(new Profile("Ravi",25,"r@mail.com","222","Delhi","Engineer"));
        profileStore.save(new Profile("Sneha",23,"s@mail.com","333","Mumbai","Designer"));
        profileStore.save(new Profile("Neha",24,"n@mail.com","444","Pune","Doctor"));
        profileStore.save(new Profile("Arjun",26,"ar@mail.com","555","Chennai","Dev"));
        profileStore.save(new Profile("Kiran",28,"k@mail.com","666","Hyderabad","Manager"));
        profileStore.save(new Profile("Meera",22,"m@mail.com","777","Kolkata","Student"));
        profileStore.save(new Profile("Raj",30,"raj@mail.com","888","Jaipur","Business"));
        profileStore.save(new Profile("Simran",27,"sim@mail.com","999","Lucknow","HR"));
        profileStore.save(new Profile("Vikram",29,"v@mail.com","000","Goa","Chef"));

        statueStore.save(new Statue("Liberty","Copper",93,"USA",1886,"Bartholdi"));
        statueStore.save(new Statue("Unity","Iron",182,"India",2018,"Ram"));
        statueStore.save(new Statue("Christ","Stone",30,"Brazil",1931,"Silva"));
        statueStore.save(new Statue("David","Marble",5,"Italy",1504,"Michelangelo"));
        statueStore.save(new Statue("Moai","Stone",10,"Chile",1400,"Unknown"));
        statueStore.save(new Statue("Buddha","Stone",15,"China",800,"Unknown"));
        statueStore.save(new Statue("Sphinx","Limestone",20,"Egypt",2500,"Unknown"));
        statueStore.save(new Statue("Lincoln","Marble",9,"USA",1922,"French"));
        statueStore.save(new Statue("Merlion","Concrete",8,"Singapore",1972,"Lim"));
        statueStore.save(new Statue("Shiva","Stone",12,"India",2000,"Unknown"));

        tollgateStore.save(new Tollgate("TG1","NH44","BLR",100,5,true));
        tollgateStore.save(new Tollgate("TG2","NH48","MUM",120,6,true));
        tollgateStore.save(new Tollgate("TG3","NH7","HYD",90,4,false));
        tollgateStore.save(new Tollgate("TG4","NH66","GOA",80,3,true));
        tollgateStore.save(new Tollgate("TG5","NH19","DEL",110,5,true));
        tollgateStore.save(new Tollgate("TG6","NH16","VIZAG",95,4,false));
        tollgateStore.save(new Tollgate("TG7","NH3","INDORE",85,3,true));
        tollgateStore.save(new Tollgate("TG8","NH75","MP",70,2,false));
        tollgateStore.save(new Tollgate("TG9","NH9","PUNE",105,5,true));
        tollgateStore.save(new Tollgate("TG10","NH67","TN",60,2,false));

        gumStore.save(new Gum("Orbit","Mint",50,10,true,"Chewing"));
        gumStore.save(new Gum("CenterFresh","Mint",20,5,true,"Chewing"));
        gumStore.save(new Gum("Boomer","Strawberry",10,4,false,"Bubble"));
        gumStore.save(new Gum("Happydent","Mint",30,6,true,"Chewing"));
        gumStore.save(new Gum("Wrigley","Mint",40,8,true,"Chewing"));
        gumStore.save(new Gum("Doublemint","Mint",35,7,true,"Chewing"));
        gumStore.save(new Gum("BigBabol","Fruit",15,3,false,"Bubble"));
        gumStore.save(new Gum("Trident","Mint",45,9,true,"Chewing"));
        gumStore.save(new Gum("Extra","Mint",60,10,true,"Chewing"));
        gumStore.save(new Gum("CenterShock","Fruit",25,5,false,"Chewing"));

        cloudStore.save(new CloudSoftware("AWS","Amazon",1000,"Cloud",100,true));
        cloudStore.save(new CloudSoftware("Azure","Microsoft",900,"Cloud",80,true));
        cloudStore.save(new CloudSoftware("GCP","Google",950,"Cloud",90,true));
        cloudStore.save(new CloudSoftware("Dropbox","Dropbox",500,"Storage",50,true));
        cloudStore.save(new CloudSoftware("Drive","Google",300,"Storage",70,true));
        cloudStore.save(new CloudSoftware("iCloud","Apple",400,"Storage",60,true));
        cloudStore.save(new CloudSoftware("Slack","Slack",700,"Collab",200,true));
        cloudStore.save(new CloudSoftware("Zoom","Zoom",600,"Meeting",150,true));
        cloudStore.save(new CloudSoftware("Teams","Microsoft",800,"Collab",180,true));
        cloudStore.save(new CloudSoftware("Notion","Notion",650,"Productivity",120,true));

        farmerStore.save(new Farmer("Ramesh",45,"Village1",2.5,"Rice",true));
        farmerStore.save(new Farmer("Suresh",50,"Village2",3.0,"Wheat",false));
        farmerStore.save(new Farmer("Mahesh",40,"Village3",1.5,"Corn",true));
        farmerStore.save(new Farmer("Rajesh",55,"Village4",4.0,"Sugarcane",true));
        farmerStore.save(new Farmer("Dinesh",38,"Village5",2.0,"Cotton",false));
        farmerStore.save(new Farmer("Naresh",47,"Village6",3.5,"Rice",true));
        farmerStore.save(new Farmer("Ganesh",42,"Village7",2.2,"Pulses",false));
        farmerStore.save(new Farmer("Kailash",60,"Village8",5.0,"Wheat",true));
        farmerStore.save(new Farmer("Harish",36,"Village9",1.8,"Vegetables",true));
        farmerStore.save(new Farmer("Raju",48,"Village10",2.7,"Fruits",false));

        acidStore.save(new Acid("HCl","HCl",1.0,"Strong",1,true));
        acidStore.save(new Acid("H2SO4","H2SO4",2.0,"Strong",1,true));
        acidStore.save(new Acid("HNO3","HNO3",1.5,"Strong",1,true));
        acidStore.save(new Acid("CH3COOH","Acetic",0.5,"Weak",3,false));
        acidStore.save(new Acid("Citric","C6H8O7",0.7,"Weak",3,false));
        acidStore.save(new Acid("Formic","HCOOH",0.6,"Weak",3,false));
        acidStore.save(new Acid("Lactic","C3H6O3",0.8,"Weak",4,false));
        acidStore.save(new Acid("Oxalic","C2H2O4",0.9,"Weak",2,false));
        acidStore.save(new Acid("Phosphoric","H3PO4",1.2,"Moderate",2,false));
        acidStore.save(new Acid("Carbonic","H2CO3",0.4,"Weak",4,false));

        saltStore.save(new Salt("NaCl","NaCl","White",36,"Salty",true));
        saltStore.save(new Salt("KCl","KCl","White",34,"Bitter",true));
        saltStore.save(new Salt("CaCO3","CaCO3","White",1,"Neutral",false));
        saltStore.save(new Salt("Na2SO4","Na2SO4","White",28,"Neutral",false));
        saltStore.save(new Salt("MgCl2","MgCl2","White",54,"Bitter",false));
        saltStore.save(new Salt("NH4Cl","NH4Cl","White",30,"Salty",false));
        saltStore.save(new Salt("NaHCO3","NaHCO3","White",10,"Mild",true));
        saltStore.save(new Salt("KNO3","KNO3","White",20,"Neutral",false));
        saltStore.save(new Salt("CuSO4","CuSO4","Blue",32,"Bitter",false));
        saltStore.save(new Salt("AgCl","AgCl","White",0.1,"Neutral",false));

        sambarStore.save(new Sambar("South","Dal","Medium",1.0,true,"Spicy"));
        sambarStore.save(new Sambar("Tamil","Dal","High",1.2,true,"Spicy"));
        sambarStore.save(new Sambar("Andhra","Dal","High",1.5,true,"VerySpicy"));
        sambarStore.save(new Sambar("Kerala","Dal","Low",1.1,true,"Mild"));
        sambarStore.save(new Sambar("Karnataka","Dal","Medium",1.3,true,"Balanced"));
        sambarStore.save(new Sambar("Udupi","Dal","Low",1.0,true,"Sweet"));
        sambarStore.save(new Sambar("Hotel","Dal","Medium",1.4,true,"Rich"));
        sambarStore.save(new Sambar("Home","Dal","Low",1.0,true,"Simple"));
        sambarStore.save(new Sambar("Village","Dal","High",1.6,true,"Strong"));
        sambarStore.save(new Sambar("Classic","Dal","Medium",1.2,true,"Traditional"));
    }
}