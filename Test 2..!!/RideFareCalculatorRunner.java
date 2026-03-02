class RideFareCalculatorRunner{
	
	public static void main(String... args){
		
		RideFareCalculator calculator = new RideFareCalculator(10,22,true,5);
			calculator.calculateFinalFare();
		RideFareCalculator calculator1 = new RideFareCalculator(15,9,false,10);
		calculator1.calculateFinalFare();
		RideFareCalculator calculator2 = new RideFareCalculator(20,24,true,30);
		calculator2.calculateFinalFare();
	}
	
	
}