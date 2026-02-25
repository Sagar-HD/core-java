class ReverseString{
	public static void main(String[] args){
		
		String word="Idli";
		System.out.println("Word before reversing :"+word);
		
		System.out.println("Word after reversing :"+reverse(word));
		
	}
	
public static String reverse(String word){
	
	
StringBuilder reversedWord=new StringBuilder("");
for(int index=word.length()-1;index>=0;index--){
	
	reversedWord.append(word.charAt(index));
}
return reversedWord.toString();
	
}
	
	
	
	
}