package classesandobjects;

import java.util.ArrayList;
import java.util.List;

class Book {
	private static int ISBN = 1000000000;
	private final long isbn;
	private String bookName;
	private String author;
	private String edition;
	private int publishedYear;
	private String publisher;
	private double price;
	
	public Book(String bookName, String author, String edition, int publishedYear, String publisher, double price) {
		this.isbn = (long)(ISBN++);
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

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", bookName=" + bookName + ", author=" + author + ", edition=" + edition
				+ ", publishedYear=" + publishedYear + ", publisher=" + publisher + ", price=" + price + "]\n";
	}
	
}

public class BookDTO{
	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
		books.add(new Book("Java", "Herbert Schildt", "13th", 2024, "McGraw-Hill Education", 500.00));
        books.add(new Book("Effective Java", "Joshua Bloch", "3rd", 2018, "Addison-Wesley", 450.00));
        books.add(new Book("Clean Code", "Robert C. Martin", "1st", 2008, "Prentice Hall", 300.00));
        System.out.println(books);
	}
}
