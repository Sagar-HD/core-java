abstract class User{
	private int userId;
	private String name;
	private String password;
	protected User(int userId,String name,String password){
		
		this.userId=userId;
		this.name=name;
		this.password=password;
		System.out.println("User created");
		
	}
	
	public abstract void showMenu();
	
	
	
}