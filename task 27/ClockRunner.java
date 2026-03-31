class ClockRunner{
	
	public static void main(String... args){
		TitanClock tc=new TitanClock("sagar",8000,8,20,25);
		TitanClock tc1=new TitanClock("madan",80,8,20,25);
		tc.getDetails();
		tc1.getDetails();
		Clock clock=new TitanClock("vivek",800,8,20,25);
		Clock clock1=new TitanClock("pavan",800,8,20,25);
		System.out.println("Hour :"+clock.getHour());
        System.out.println("Minutes :"+clock1.getMinutes());
		Clock clock2=new Clock(8,20,40);
		System.out.println("Hour :"+clock2.getHour()+" Minutes :"+clock2.getMinutes());
	}
	
	
}