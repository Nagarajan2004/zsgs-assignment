package packages.library.database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import packages.library.books.Book;
import packages.library.members.Member;
import packages.library.transactions.Transaction;

public class LibraryDatabase {
	private static LibraryDatabase database;
	
	private Map<Integer, Book> books = new HashMap<>();
	private Map<Integer, Member> members = new HashMap<>();
	private List<Transaction> transactions = new ArrayList<Transaction>();
	
	public static LibraryDatabase getInstance() {
		if(database == null) {
			return database = new LibraryDatabase();
		}
		return database;
	}
	
	public void addBook(Book book) {
		books.put(book.getBookId(), book);
	}
	
	public void addMember(Member member) {
		members.put(member.getMemberId(), member);
	}
	
	public void addTransaction(Transaction transaction) {
		transactions.add(transaction);
	}
	
	public Book getBookByID(int bId) {
		return books.get(bId);
	}
	
	public Map<Integer, Book> getAllBook(){
		return books;
	}

	public Map<Integer, Member> getAllMembers() {
		return members;
	}

	public Member getMemberById(int memberId) {
		return members.get(memberId);
	}
}
