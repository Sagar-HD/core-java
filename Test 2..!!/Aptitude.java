class Aptitude{
	
	void SumOfEvenOdd(int[] arr){
		int evenSum=0;
		int oddSum=0;
		for(int i=0;i<arr.length;i++){
			if(i%2==0){
				evenSum+=arr[i];
			}
			else{
				oddSum+=arr[i];
			}
		}
		System.out.println("Even sum :"+evenSum+" Odd Sum :"+oddSum);
		
		
		
	}
	String reverseString(String name){
		StringBuilder rev=new StringBuilder("");
		for(int i=name.length()-1;i>=0;i--){
			rev.append(name.charAt(i));
		}
		return rev.toString();
		
		
	}
	void isPalindrome(int num){
		int copy=num;
		int rev=0;
		while(copy>0){
			int digit=copy%10;
			rev=rev*10+digit;
			copy/=10;
			
		}
		if(num==rev){
			System.out.println("it is an palindrome");
		}
		else{
			System.out.println("it is not an palindrome");
		}
		
		
	}
	void sumOfArray(int[] arr){
		int sum=0;
		for(int elem :arr){
			sum+=elem;
		}
		System.out.println("Sum is :"+sum);
	}
	
}