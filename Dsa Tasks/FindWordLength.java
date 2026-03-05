class FindWordLength{
	
	public static void main(String... args){
		
		String[] words={"sagar","shaiva","is","from","sakleshpur"};
		for(String word : words){
			System.out.println("world length : "+word.length());
			if(word.length()>4){
				System.out.println("world  : "+word);
				
			}
			
		}
	}
	
	
	
}