package classesandobjects;

public class BookDTO {
	private static int ISBN;
	private final long isbn;
	private String bookName;
	private String author;
	private String edition;
	private int publishedYear;
	private String publisher;
	private double price;
	
	public BookDTO(String bookName, String author, String edition, int publishedYear, String publisher, double price) {
		this.isbn = (++ISBN)*1000000000;
		this.bookName = bookName;
		this.author = author;
		this.edition = edition;
		this.publishedYear = publishedYear;
		this.publisher = publisher;
		this.price = price;
	}
	
	public long getIsbn() {
		return isbn;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public int getPublishedYear() {
		return publishedYear;
	}

	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
