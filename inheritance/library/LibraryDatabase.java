package inheritance.library;

import java.util.List;

public class LibraryDatabase {
	List<Book> allBooks;
	List<Librarian> librarians;
	LibraryDatabase(List<Book> allBooks){
		this.allBooks = allBooks;
	}
	public void add(Book book) {
		allBooks.add(book);
	}
	public void delete(Book book) {
		allBooks.remove(book);
	}
	public List<Book> display() {
		return allBooks;
	}
	public int search(Book book) {
		return allBooks.indexOf(book);
	}
	public void addLibrarian(Librarian l) {
		librarians.add(l);
	}
}
