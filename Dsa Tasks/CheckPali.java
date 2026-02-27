class CheckPali{
	public static void main(String[] args){
		int n=121;
		int m=122;
		System.out.println(n+" is a palindrome :"+isPali(n));
		System.out.println(m+" is a palindrome :"+isPali(m));
		
		
	}
	
	
	static boolean isPali(int n){
		
		int copy=n;
		int rev=0;
		while(copy>0){
			int digit=copy%10;
			rev=(rev*10)+digit;
			copy/=10;
		}
		return rev==n;
		
	}
	
	
}