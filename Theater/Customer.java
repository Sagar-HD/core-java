class Customer extends User{
	@Override
	public void showMenu(){
		
		System.out.println("will be implemented later");
		
		
		
	}
	
	public Customer(int userId,String name,String password){
		super(userId,name,password);
			System.out.println("customer created");
	}
	
	
	
}