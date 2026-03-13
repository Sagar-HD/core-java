class Amstrong{
	
	static boolean isAmstrong(int num){
		
		int count=0;
		int copy=num;
		while(copy>0){
			copy/=10;
			count++;
		}
		int ans=0;
		copy=num;
		while(copy>0){
			int digit=copy%10;
			ans+=Math.pow(digit,count);
			copy/=10;
			
		}
		return ans==num;
	}
	public static void main(String... args){
		
		System.out.println(isAmstrong(153));
		System.out.println(isAmstrong(154));
	}
	
	
	
}