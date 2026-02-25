import java.util.Scanner;
class Main{
	public static void main(String[] args) throws Exception{
		
		Library lib=new Library();
		boolean loop=true;
		Scanner scanner=new Scanner(System.in);
		while(loop){
			System.out.println("enter 1. to add book");
			System.out.println("enter 2. to add Student");
			System.out.println("enter 3. to Borrow Book");
			System.out.println("enter 4. to return Book");
			System.out.println("enter 5. to display books");
			System.out.println("enter 6. to display Students");
			System.out.println("enter 7. to exit");
			int choice=scanner.nextInt();
			scanner.nextLine();
		switch(choice){
			case 1:
			System.out.println("book Id");
			int bookId=scanner.nextInt();
			scanner.nextLine();
			System.out.println("Author name");
			String authorName=scanner.nextLine();
			System.out.println("Title of book");
			String bookTitle=scanner.nextLine();
			lib.addBook(bookId,authorName,bookTitle);
			break;
			case 2:
			System.out.println("user Id");
			int userId=scanner.nextInt();
			scanner.nextLine();
			System.out.println("Student name");
			String studentName=scanner.nextLine();
			lib.addStudent(userId,studentName);
			
			break;
			case 3:
			System.out.println("book Id");
			int borrowBookId=scanner.nextInt();
			scanner.nextLine();
			System.out.println("user Id");
			int borrowUserId=scanner.nextInt();
			scanner.nextLine();
			//try{
			lib.borrowBook(borrowBookId,borrowUserId);
			  //}
			//catch(Exception e){
			//	System.out.println(e);
			//}
			break;
			case 4:
				System.out.println("book Id");
			int returnBookId=scanner.nextInt();
			scanner.nextLine();
			System.out.println("user Id");
			int returnUserId=scanner.nextInt();
			scanner.nextLine();
			lib.returnBook(returnBookId,returnUserId);
			break;
			case 5:
			lib.displayBooks();
			break;
			case 6:
			lib.displayUsers();
			break;
			case 7:
			loop=false;
			break;
			default:
			System.out.println("Invalid Input");
			break;
			
			
		}
			
		}
	}
}