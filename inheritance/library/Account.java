package inheritance.library;

public class Account {
	private short numberOfBorrowBooks;
	private short numberOfReservedBooks;
	private short numberOfReturnedBooks;
	private short numberOfLostBooks;
	private double fineAmount;

	public Account() {}
	
	public short getNumberOfBorrowBooks() {
		return numberOfBorrowBooks;
	}
	public void setNumberOfBorrowBooks(short numberOfBorrowBooks) {
		this.numberOfBorrowBooks = numberOfBorrowBooks;
	}
	public short getNumberOfReservedBooks() {
		return numberOfReservedBooks;
	}
	public void setNumberOfReservedBooks(short numberOfReservedBooks) {
		this.numberOfReservedBooks = numberOfReservedBooks;
	}
	public short getNumberOfReturnedBooks() {
		return numberOfReturnedBooks;
	}
	public void setNumberOfReturnedBooks(short numberOfReturnedBooks) {
		this.numberOfReturnedBooks = numberOfReturnedBooks;
	}
	public short getNumberOfLostBooks() {
		return numberOfLostBooks;
	}
	public void setNumberOfLostBooks(short numberOfLostBooks) {
		this.numberOfLostBooks = numberOfLostBooks;
	}
	public double getFineAmount() {
		return fineAmount;
	}
	public void setFineAmount(double fineAmount) {
		this.fineAmount = fineAmount;
	}
	
	public double calculateFine() {
		return fineAmount;
	}
}
