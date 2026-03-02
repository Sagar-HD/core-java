class InventoryManagerRunner{
	public static void main(String... args){
		
		
		InventoryManager im=new InventoryManager(1,"shoes",300,33,500,5,false);
		InventoryManager im1=new InventoryManager(2,"hat",10,10,20,2,true);
		InventoryManager im2=new InventoryManager(3,"Icecream",200,5,4,2,true);
		System.out.println("Average Inventory value 1 "+im.getAverageInventoryValue());
		
			System.out.println("reorder point 1: "+im.calculateReorderPoint());
		System.out.println("stock status 1: "+im.checkStockStatus());
		System.out.println("weekly revenue 1: "+im.calculateWeeklyRevenue());
		im.restock(10);
		
		
		System.out.println("Average Inventory value 2 "+im1.getAverageInventoryValue());
		
			System.out.println("reorder point 2: "+im1.calculateReorderPoint());
		System.out.println("stock status 2: "+im1.checkStockStatus());
		System.out.println("weekly revenue 2: "+im2.calculateWeeklyRevenue());
		im1.restock(20);
		
			System.out.println("Average Inventory value 3 "+im2.getAverageInventoryValue());
		
			System.out.println("reorder point 3: "+im2.calculateReorderPoint());
		System.out.println("stock status 3: "+im2.checkStockStatus());
		System.out.println("weekly revenue 3: "+im2.calculateWeeklyRevenue());
		im2.restock(30);
	}
	
	
	
}