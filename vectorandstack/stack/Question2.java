package vectorandstack.stack;

import java.util.Stack;

public class Question2 {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("first");
		stack.push("second");
		stack.push("third");
		stack.push("third");
		System.out.println("stack ==> "+stack);
		System.out.println("peek element of stack ==> "+stack.peek());
		System.out.println("\'second\' element at position "+stack.search("second"));
	}
}
