package exceptionhandling.bank;

class InsufficientBalanceException extends Exception{
	InsufficientBalanceException(){
		super("Insufficient Balance !!!");
	}
}
