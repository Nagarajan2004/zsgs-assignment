package exceptionhandling;

import java.util.Scanner;

class DivideByZeroException extends Exception{
	public DivideByZeroException() {
		super("dinamenater must not be zero");
	}
}

public class CustomException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter numerator");
		int n = sc.nextInt();
		System.out.println("enter dinamenater");
		int d = sc.nextInt();
		try {
			if(d == 0) throw new DivideByZeroException();
			System.out.println("result : "+(n/d));
		}catch(DivideByZeroException e) {
			System.out.println(e.getMessage());
		}
	}
}
