package exceptionhandling.bank;

public class Bank {
	double balance;

	Bank(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withDraw(double amount) {
		try {
			balance -= amount;
			if (balance <= 0) {
				throw new InsufficientBalanceException();
			}
			if(balance <= 1000) {
				System.out.println("you reached minimum balance");
			}
		} catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
	}
}
