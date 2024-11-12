package inheritance.library;

public class User {
	private String name;
	private int id;
	private Account account;
	
	public User(String name, int id) {
		this.name = name;
		this.id = id;
		this.account = new Account();
	}
	
	public String getName() {return name;}
	public int getId() {return id;}
	public Account getAccount() {return account;}
	
	private void verify() {
		System.out.println("verify...");
	}
	
	private void checkAccount() {
		System.out.println("check account...");
	}
	
	private void get_book_info() {
		System.out.println("book info...");
	}
}
