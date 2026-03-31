class TitanClock extends Clock{

	String ownerName;
	double price;
	
	TitanClock(String ownerName,double price,int hr,int minutes,int seconds){
			super(hr,minutes,seconds);
			this.ownerName=ownerName;
			this.price=price;
	}
	
	void getDetails(){
	
		System.out.println("ownerName :"+this.ownerName);
		System.out.println("price :"+this.price);
		System.out.println("hr :"+this.hr);
		System.out.println("minutes :"+this.minutes);
		System.out.println("seconds :"+this.seconds);
		
	}
	
}
