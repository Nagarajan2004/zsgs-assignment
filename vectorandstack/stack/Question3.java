package vectorandstack.stack;

import java.util.Scanner;
import java.util.Stack;

public class Question3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> stack = new Stack<>();
		System.out.println("enter a string");
		String s = sc.next();
		for(char ch : s.toCharArray()) {
			stack.push(ch);
		}
		while(!stack.isEmpty()) {
			System.out.print(stack.pop());
		}
	}
}
