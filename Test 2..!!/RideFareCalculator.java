class RideFareCalculator{
	int distance;
	int time;
	boolean isSurgePricing;
	int waitingMinutes;
	RideFareCalculator(int distance,int time,boolean isSurgePricing,int waitingMinutes){
		this.distance=distance;
		this.time=time;
		this.isSurgePricing=isSurgePricing;
		this.waitingMinutes=waitingMinutes;
	}
	
	double calculateBaseFare(int distance){
		if(distance<=2){
			System.out.println("base fare: "+ "5");
			return 5;}
		System.out.println("base fare: "+(5+(distance-2)*1.5));
		return 5+(distance-2)*1.5;
	}
	double applyTimeSurcharge(double baseFare,int time){
		if(time>=23 && time<=5){
			double extra=baseFare/4;
			System.out.println("fare after sur charge : "+baseFare+extra);
			return baseFare+extra;
			
		}
		else if((time>=7 && time<=9) || (time>=17 && time<=19)){
			double extra=baseFare*(3/20);
			System.out.println("fare after sur charge : "+baseFare+extra);
			return baseFare+extra;
			
		}
		else{
			System.out.println("fare after sur charge : "+baseFare);
			return baseFare;
		}
		
		
	}
	double applyWaitingCharges(double fareAfterTime,int waitingMinutes){
		if(waitingMinutes<=2){
			return fareAfterTime;
		}
		waitingMinutes-=2;
		double res=fareAfterTime+waitingMinutes*0.50;
				System.out.println("fare after waiting charge : "+res);
		return res;
		
		
		
	}
	void calculateFinalFare(){
		double BaseFare=calculateBaseFare(this.distance);
		double fareAfterSurcharge;
		if(this.isSurgePricing){
		 fareAfterSurcharge=applyTimeSurcharge(BaseFare,this.time);
		}
		else{
			System.out.println("no sur charge applicable");
			 fareAfterSurcharge=BaseFare;
		}
		double fareAfterWaitingCharge=applyWaitingCharges(fareAfterSurcharge,this.waitingMinutes);
		System.out.println("final fare : "+fareAfterWaitingCharge);
		
		
		
	}
	
	
}