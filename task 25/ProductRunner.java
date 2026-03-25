
public class ProductRunner {
	public static void main(String... args ){
	ProductStore store=new ProductStore();
	Product product1=new Product("shoe","hrx", "24-2-2026",870.5, Seller.AMAZON, WarrantyYears.ONE,
			false, 1, "Usa");
	store.save(product1);
	store.display();
	Product[] productsToAdd={new Product("shoe","puma", "24-2-2026",870.5, Seller.AMAZON, WarrantyYears.ONE,
			false, 2, "Usa"),new Product("shoe","adidas", "24-2-2026",870.5, Seller.AMAZON, WarrantyYears.ONE,
					false, 3, "Usa"),new Product("shoe","nike", "24-2-2026",870.5, Seller.AMAZON, WarrantyYears.ONE,
							false, 4, "Usa"),new Product("shoe","one8", "24-2-2026",870.5, Seller.AMAZON, WarrantyYears.ONE,
									false, 5, "Usa")};
	store.save(productsToAdd);
	store.display();
	Product[] products20=new Product[20];
	store.save(products20);
	boolean isFound=store.searchById(4);
	System.out.println("product found "+isFound);
	isFound=store.searchById(8);
	System.out.println("product found "+isFound);
	isFound=store.searchByUniqeIdAndName(4,"shoe");
	System.out.println("product found "+isFound);
	isFound=store.searchByUniqeIdAndName(5,"pen");
	System.out.println("product found "+isFound);
	isFound=store.searchByUniqeIdAndNameAndOriginCountry(5,"shoe","Usa");
	System.out.println("product found "+isFound);
	isFound=store.searchByUniqeIdAndNameAndOriginCountry(5,"shoe","India");
	System.out.println("product found "+isFound);
	store. getAllOriginCountry();
	boolean WarrantyExpired=store.checkWarrantyExpiredByUniqueId(4);
	System.out.println("warranty expired : "+WarrantyExpired);
	 WarrantyExpired=store.checkWarrantyExpiredByUniqueId(9);
	System.out.println("warranty expired : "+WarrantyExpired);
	store.getAllByType("shoe");
	store.getAllByWarrantyYears(WarrantyYears.ONE);
	
	}
	

}
