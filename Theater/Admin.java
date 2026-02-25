class Admin extends User{
	@Override
	public void showMenu(){
		
		System.out.println("will be implemented later");
		
		
		
	}
	
	
	private Admin(int userId,String name,String password){
		super(userId,name,password);
		System.out.println("admin created");
	
	}
	
	
	
	
	
	
}