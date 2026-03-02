class InventoryManager{
static int totalProductsTracked=0;
static double totalInventoryValue=0.0;
	int productId;
	String productName;
	int currentStock;
	double dailySalesRate;
	double unitPrice;
	int leadTimeDays;
	boolean isSeasonal;
	InventoryManager(int productId,	String productName,int currentStock,double dailySalesRate,	double unitPrice,int leadTimeDays,boolean isSeasonal){
		this.productId=productId;
		this.productName=productName;
		this.currentStock=currentStock;
		this.dailySalesRate=dailySalesRate;
		this.unitPrice=unitPrice;
		this.leadTimeDays=leadTimeDays;
		this.isSeasonal=isSeasonal;
		totalProductsTracked++;
		totalInventoryValue+=(this.currentStock*this.unitPrice);
		
		
		
		
	}
	static double getAverageInventoryValue(){
		return totalInventoryValue/totalProductsTracked;
	}
	double calculateReorderPoint(){
		double reorderPoint=this.dailySalesRate*this.leadTimeDays*1.5;
		if(this.isSeasonal){
		    reorderPoint*=1.3;
		}
		if(this.currentStock<20){
			reorderPoint+=10;
		}
		
		return reorderPoint;
	}
	String checkStockStatus(){
		if(this.currentStock<=0)return "OUT OF STOCK - URGENT";
		else if(currentStock<=calculateReorderPoint())return ("REORDER NEEDED - Order"+(calculateReorderPoint()*2-this.currentStock)+" Units");
		else if(this.currentStock<=calculateReorderPoint()*1.5)return "LOW STOCK Monitor closely";
		else return "HEALTHY STOCK";
		
	}
	double calculateWeeklyRevenue(){
		int workingDays=7;
		int stocks=this.currentStock;
		int unitsSold=0;
		while(stocks-this.dailySalesRate>=0 && workingDays>=1){
			stocks-=this.dailySalesRate;
			unitsSold+=dailySalesRate;
			
		}
		return unitPrice*this.unitPrice;
		
	}
	void restock(int unitsReceived){
		this.currentStock+=unitsReceived;
		totalInventoryValue+=unitsReceived*unitPrice;
		System.out.println(" Restocked "+unitsReceived+" Units of" +this.productName);
	}
	
}