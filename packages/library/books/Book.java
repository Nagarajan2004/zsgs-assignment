package packages.library.books;

public class Book {
	private static int bookId = 0;

	private String title;
	private long isbn;
	private String author;
	private String publisher;
	private int uniqueId;
	private boolean status = true;
	
	public Book(String bookTitle, long bookISBN, String bookAuthor, String bookPublisher){
		this.title = bookTitle;
		this.isbn = bookISBN;
		this.author = bookAuthor;
		this.publisher = bookPublisher;
		this.uniqueId = ++bookId;
	}


	public String getTitle() {
		return title;
	}

	public long getIsbn() {
		return isbn;
	}

	public String getAuthor() {
		return author;
	}

	public String getPublisher() {
		return publisher;
	}

	public int getBookId() {
		return uniqueId;
	}
	
	public boolean isAvailable() {
		return status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public String toString() {
		return bookId + "    "+title;
	}
}
