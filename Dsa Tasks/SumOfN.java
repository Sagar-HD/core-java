class SumOfN{
	public static void main(String... args){
		int arr[]={1,2,3,4,5};
		System.out.println("sum of elements is "+getSum(arr));
		
		
		
		
	}
	
	static int getSum(int[] arr){
		int sum=0;
		for(int num : arr){
			sum+=num;
		}
		return sum;
	}
}