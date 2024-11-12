package inheritance.library;

import java.util.Date;
import java.util.List;

public class Book {
	private String title;
	private String author;
	private long ISBN;
	private String publication;
	private Date dueDate;
	private Date renewDate;
	private List<String> feedback;
	private boolean isReserved;
	
	public Book(String title, String author, long iSBN, String publication) {
		this.title = title;
		this.author = author;
		ISBN = iSBN;
		this.publication = publication;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public long getISBN() {
		return ISBN;
	}

	public void setISBN(long iSBN) {
		ISBN = iSBN;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}
	
	public Date showDueDate() {
		return dueDate;
	}
	
	public void reserveBook() {
		this.isReserved = true;
	}
	
	public boolean reservationStatus() {
		return isReserved;
	}
	
	public List<String> feedBack(){
		return feedback;
	}
	
	public void addFeedback(String feedback) {
		this.feedback.add(feedback);
	}
	
	public boolean bookRequest() {
		return reservationStatus();
	}
	
	public Date renewInfo() {
		return renewDate;
	}
}
