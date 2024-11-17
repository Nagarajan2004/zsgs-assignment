package packages.library.view;

import java.util.List;
import java.util.Scanner;

import packages.library.books.Book;
import packages.library.members.Member;
import packages.library.viewmodel.LibraryViewModel;

public class LibraryView {
	private Scanner scanner;
	private LibraryViewModel libraryViewModel;
	
	public LibraryView() {
		libraryViewModel = new LibraryViewModel(this);
		scanner = new Scanner(System.in);
	}
	
	public void init() {
		System.out.println("---------------Library--------------");
		while(true) {
			System.out.println("Enter your choise ");
			System.out.println("\t1. Add Book");
			System.out.println("\t2. Add Member");
			System.out.println("\t3. Barrow Book");
			System.out.println("\t4. Return Book");
			System.out.println("\t5. Search Book");
			System.out.println("\t6. Show All Books");
			System.out.println("\t0. Exit");
			byte choice = scanner.nextByte();
			switch(choice) {
				case 1:
					addBook();
					break;
				case 2:
					addMember();
					break;
				case 3:
					barrowBook(true);
					break;
				case 4:
					barrowBook(false);
					break;
				case 5:
					searchBook();
					break;
				case 6:
					displayAllBooks();
					break;
				case 0:
					System.exit(0);
				default :
					System.out.println("Invalid choice !!!");
			}
			
		}
	}
	
	private void addBook() {
		System.out.println("~~~~~~~~~Enter Book Details~~~~~~~~~~");
		System.out.print("Enter book title : ");
		String bookTitle = scanner.next();
		System.out.print("Enter book publisher : ");
		String bookPublisher = scanner.next();
		System.out.print("Enter book Author : ");
		String bookAuthor = scanner.next();
		System.out.print("Enter book ISBN : ");
		long bookISBN = scanner.nextLong();
		
		Book newBook = new Book(bookTitle, bookISBN, bookAuthor, bookPublisher);
		newBook.setStatus(true);
		libraryViewModel.addBook(newBook);
	}
	
	private void addMember() {
		System.out.println("~~~~~~~~~~~~Enter Member Details~~~~~~~~~~~~");
		System.out.print("Enter name : ");
		String name = scanner.next();
		System.out.print("Enter email : ");
		String email = scanner.next();
		System.out.println("Enter phone number : ");
		long phoneNumber = scanner.nextLong();
		
		Member newMember = new Member(name, email, phoneNumber);
		libraryViewModel.addMember(newMember);
	}
	
	private void barrowBook(boolean isBarrow) {
		System.out.println("~~~~~~~~~~~~Enter Details~~~~~~~~~~~~");
		System.out.print("enter book id : ");
		int bookId = scanner.nextInt();
		System.out.print("enter meber id : ");
		int memberId = scanner.nextInt();
		libraryViewModel.barrowBook(bookId, memberId, isBarrow);
	}
	
	private void searchBook() {
		System.out.println("~~~~~~~~~~~~Enter Details~~~~~~~~~~~~");
		System.out.print("Enter book Name : ");
		String bookName = scanner.next();
		List<String> foundBooks = libraryViewModel.searchBook(bookName);
		if(foundBooks.isEmpty()) {
			System.out.println("No Books are found name of "+bookName+" !!!");
		} else {
			System.out.println(foundBooks);
		}
	}
	
	public void displayAllBooks() {
		List<String> allBooks = libraryViewModel.getAllBooks();
		allBooks.forEach(book -> System.out.println(book));
	}
	
	public void showText(String s) {
		System.out.println(s+" is successfully added");
	}

	public void showError(String err) {
		System.out.println(err);
	}
	
}
