package inheritance.library;

import java.util.List;

public class Librarian {
	private String name;
	private int id;
	private String password;
	private String searchString;
	private LibraryDatabase libraryDatabase;
	private List<Book> books;
	public Librarian(String name, int id, String password, String searchString) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
		this.searchString = searchString;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean verifyLibrarian(int id, String password) {
		return this.id == id && this.password.equals(password);
	}
	public boolean Search(String s) {
		return s.equals(searchString);
	}
}
