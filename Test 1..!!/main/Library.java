import java.util.ArrayList;

class Library  {
	
 private ArrayList<Book> books;
 private ArrayList<User> users;
 
	 public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }
	
	public void addBook(int bookId,String authorName,String title){
		Book newbook = new Book(bookId,authorName,title);

		books.add(newbook);
		System.out.println("Book added Sucessfully");
	}
	public void borrowBook(int bookId,int userId) throws BookNotFoundException,StudentNotFoundException{
		Book bookToAdd=null;
				 for (Book book : books) {
        if (book.getId() == bookId) {
            bookToAdd=book;
        }
    }
	if(bookToAdd==null){
		throw new BookNotFoundException();
	}
		 for (User user : users) {
        if (user.getId() == userId) {
            user.borrowBook(bookToAdd);
			return;
        }
    }
       throw new StudentNotFoundException(); 
	}
		public void returnBook(int bookId,int userId){
		Book bookToReturn=null;
				 for (Book book : books) {
        if (book.getId() == bookId) {
            bookToReturn=book;
        }
    }
		 for (User user : users) {
        if (user.getId() == userId) {
            user.returnBook(bookToReturn);
        }
    }

	}
	public void addStudent(int userId,String userName){
		User newUser = new Student(userName,userId);
		users.add(newUser);
		System.out.println("Student added Sucessfully");
	}
	public void displayBooks(){
		for(Book book : books){
			book.getTitle();
		}
	}
	public void displayUsers(){
		for(User user : users){
			user.getName();
		}
	}
	
}