package vectorandstack.stack;

import java.util.Scanner;
import java.util.Stack;

public class Question4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> stack = new Stack<>();
		System.out.println("parentheses : ");
		String parentheses = sc.next();
		boolean isBlanced = true;
		for(int i = 0; i < parentheses.length(); i++) {
			char ch = parentheses.charAt(i);
			if(ch == '(') {
				stack.push(ch);
			} else {
				if(stack.isEmpty()) {
					isBlanced = false;
					break;
				} else {
					stack.pop();
				}
			}
		}
		System.out.println((stack.isEmpty() && isBlanced) ? parentheses+"is balanced" : parentheses+"is not balanced");
	}
}
