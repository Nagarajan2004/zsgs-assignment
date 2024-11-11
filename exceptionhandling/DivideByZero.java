package exceptionhandling;

import java.util.Scanner;

public class DivideByZero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter numerator");
		int n = sc.nextInt();
		System.out.println("enter dinamenater");
		int d = sc.nextInt();
		try {
			System.out.println("result : "+(n/d));
		}catch(ArithmeticException e) {
			System.out.println("dinamenater must not be zero");
		}
	}
}
