package vectorandstack.stack;

import java.util.Stack;

public class Question1 {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		for(int i = 1; i <= 5; i++) {
			stack.push(i*10);
		}
		System.out.println(stack);
		System.out.println("popping top of the stack => "+stack.pop());
		System.out.println(stack);
	}
}
