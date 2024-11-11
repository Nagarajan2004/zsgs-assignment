package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter phone number : ");
		try {
			long number = sc.nextLong();
			if(((int)Math.log10(number)+1) != 10.0) {
				throw new InputMismatchException();
			}
			System.out.println(number);
		} catch (InputMismatchException e) {
			System.out.println("Invalid Phone Number");
		}
	}
}
