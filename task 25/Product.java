/* Declare name,make,mfgDate,cost,type:enum,seller,warrantyYears:enum,warrantyExpired,uniqueId,originCountry as instance variables. Declare a class to store,search ,display product. Store least 137 products without GEN AI. Write below methods 1. save one product .save(Product product) 2. save multiple products with max 10 .save(Product[] products) 3. searchByUniqeId 4. searchByUniqeIdAndName 5. searchByUniqeIdAndNameAndOriginCountry 6. getAllOriginCountry 7. checkWarrantyExpiredByUniqueId 8. displayAllProducts 9. getAllByType 10. getAllByWarrantyYears*/

class Product{
	String name;
	String make;
	String mfgDate;
	double cost;
	Seller seller;
	WarrantyYears warantyyear;
	boolean warrantyExpired;
	int uniqueId;
	String originCountry;
	
	public Product(String name, String make, String mfgDate, double cost, Seller seller, WarrantyYears warantyyear,
			boolean warrantyExpired, int uniqueId, String originCountry) {
		super();
		this.name = name;
		this.make = make;
		this.mfgDate = mfgDate;
		this.cost = cost;
		this.seller = seller;
		this.warantyyear = warantyyear;
		this.warrantyExpired = warrantyExpired;
		this.uniqueId = uniqueId;
		this.originCountry = originCountry;
	}
	
	void display(){
		System.out.println(" item details \n"+this.name+" "+this.make+" "+this.mfgDate+" "+this.cost+" "+this.seller+" "+this.warantyyear+" "+this.uniqueId+" "+this.originCountry);
	}
	
	
}