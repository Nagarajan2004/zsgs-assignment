package packages.library.viewmodel;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import packages.library.books.Book;
import packages.library.database.LibraryDatabase;
import packages.library.members.Member;
import packages.library.view.LibraryView;

public class LibraryViewModel {
	private LibraryView libraryView;
	private LibraryDatabase libraryDatabase;
	
	public LibraryViewModel(LibraryView libraryView) {
		this.libraryView = libraryView;
		libraryDatabase = LibraryDatabase.getInstance();
	}
	
	public void addBook(Book book) {
		libraryDatabase.addBook(book);
		libraryView.showText(book.getTitle()+" book ");
	}
	
	public void addMember(Member member) {
		libraryDatabase.addMember(member);
		libraryView.showText(member.getName()+" member ");
	}
	
	public void barrowBook(int bookId, int memberId, boolean isBarrow) {
		if(!(libraryDatabase.getAllBook().keySet().contains(bookId) 
				&& libraryDatabase.getAllMembers().keySet().contains(memberId))) {
			libraryView.showError("book ID or Member ID NOT FOUND !!!");
			return;
		}
		
		Book currBook = libraryDatabase.getBookByID(bookId);
		Member currMember = libraryDatabase.getMemberById(memberId);
		
		if(!isBarrow) {
			currMember.allBook().remove(currBook);
			currBook.setStatus(true);
			return;
		}
		
		if(!currBook.isAvailable()) {
			libraryView.showError("Book is Not Available !!!");
			return;
		}
		
		currMember.addBook(currBook);
		currBook.setStatus(false);
	}

	public List<String> searchBook(String bookName) {
		List<String> foundBooks = new ArrayList<>();
		
		for (Map.Entry<Integer, Book> bookEntry : libraryDatabase.getAllBook().entrySet()) {
			if(bookEntry.getValue().getTitle().toLowerCase().equals(bookName.toLowerCase())) {
				foundBooks.add(bookEntry.getValue().getTitle());
			}
		}
		
		return foundBooks;
	}
	
	public List<String> getAllBooks(){
		List<String> allBooks = new ArrayList<String>();
		for (Map.Entry<Integer, Book> bookEntry : libraryDatabase.getAllBook().entrySet()) {
			allBooks.add(bookEntry.getValue().getBookId()+" "+bookEntry.getValue().getTitle());
		}
		return allBooks;
	}
	
}
