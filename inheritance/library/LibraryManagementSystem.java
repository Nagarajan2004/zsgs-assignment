package inheritance.library;

import java.util.List;

public class LibraryManagementSystem {
	private String userType;
	private String userName;
	private String password;
	private List<User> userList;
	private List<Book> bookList;
	private List<Librarian> librarianList;
	
	public LibraryManagementSystem(String userType, String username, String password, List<Librarian> librarian) {
        this.userType = userType;
        this.userName = username;
        this.password = password;
        this.librarianList = librarian;
    }

    public void addUser(User user){
        userList.add(user);
    }
    public void addBook(Book book){
        bookList.add(book);
    }
	
	public void Login() {
		System.out.println("Login....");
	}
	public void register() {
		System.out.println("Register...");
	}
	public void logout() {
		System.out.println("logout...");
	}
}
