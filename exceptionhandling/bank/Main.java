package exceptionhandling.bank;

public class Main {
	public static void main(String[] args) {
		Bank user1 = new Bank(1000); // 1000
		user1.deposit(2000); // 3000
		user1.withDraw(1000); // 2000
		user1.withDraw(1999); // 1
		user1.withDraw(1000); // -999
	}
}
