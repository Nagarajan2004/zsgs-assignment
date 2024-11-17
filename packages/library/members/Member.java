package packages.library.members;

import java.util.ArrayList;
import java.util.List;

import packages.library.books.Book;

public class Member {
	private static int mId= 0;
	
	private String name;
	private int memberId;
	private String email;
	private long phoneNumber;
	private List<Book> books;
	
	public Member(String name, String email, long phoneNumber) {
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.memberId = ++mId;
		books = new ArrayList<Book>();
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public int getMemberId() {
		return memberId;
	}
	
	public long getmemberPhoneNumber() {
		return phoneNumber;
	}

	public void addBook(Book book) {
		books.add(book);
	}
	
	public List<Book> allBook(){
		return books;
	}
	
	public String toString() {
		return memberId+"    "+name;
	}
}
