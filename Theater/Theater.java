import java.util.HashMap;
import java.util.Scanner;
class Theater{
	
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
	private final Admin admin=new Admin(1,"sagar","sagarhd");
	private HashMap<String,Customer> customers=new HashMap<>();
	private HashMap<String,Show> shows=new HashMap<>();
	static int noOfUsers=0;
	User loggedInUser=null;
 public void showMenu(){
	
	System.out.println("press 1 to Login as Admin");
	System.out.println("press 2 to Login as Customer");
    System.out.println("press 3 to Register as Customer");
}
	public void registerCustomer(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a user name");
		String userName=scanner.nextLine();
		System.out.println("enter a password");
		String password=scanner.nextLine();
		Customer customer=new Customer(Theater.noOfUsers+1,userName,password);
		customers.put(userName,customer);
		Theater.noOfUsers+=1;
		
	}
	public void loginCustomer(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a user name");
		String userName=scanner.nextLine();
		System.out.println("enter a password");
		String password=scanner.nextLine();
		Customer loginCustomer=customers.get(userName);
		if(loginCustomer==null){
			System.out.println("Invalid username or password not found");
			return;
		}
		if(true){
		loggedInUser=loginCustomer;
		System.out.println("Customer logged in sucessfully");
		}
		else{
			System.out.println("Invalid username or password");
			return;
		}
		
	}
	/*public void loginAdmin(){
	Scanner scanner=new Scanner(System.in);
		System.out.println("enter a user name");
		String userName=scanner.nextLine();
		System.out.println("enter a password");
		String password=scanner.nextLine();
		
		if(userName!=this.admin.userName){
			System.out.println("user not found");
			return;
		}
		if(password!=this.admin.password){
			System.out.println("Invalid username or password");
			return;
			
			
		}
		else{
			loggedInUser=this.admin;
		System.out.println("Admin logged in sucessfully");
		}
		
	}*/
	
}