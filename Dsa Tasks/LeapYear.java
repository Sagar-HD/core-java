class LeapYear{
	
	public static void main(String... args){
		
		if(isLeapYear(2000)){
			System.out.println("it is a leap year");
		}
		else{
			System.out.println("it is not a leap year");
		}
		
		
		
	}
static boolean isLeapYear(long year){
	
	if(year%400==0){
		
		return true;
		
		
	}
	else if(year&4==0 && year%100!=0){
		return true;
	}
	return false;
	
}	
	
	
}