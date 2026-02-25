class SumOfEvenAndOdd{
	
	public static void main(String... args){
		
		int[] arr={1,2,3,4};
		System.out.println("even : "+getEven(arr));
	    System.out.println("Odd : "+getOdd(arr));
		
		
	}
	public static int getEven(int[] arr){
		int even=0;
		for(int elem:arr){
			if(elem%2==0)even+=elem;
		}
		return even;
	}
	
	public static int getOdd(int[] arr){
		int odd=0;
		for(int elem:arr){
			if(elem%2!=0)odd+=elem;
			
		}
		return odd;
	}
	
	
}