package vectorandstack.stack;

import java.util.Arrays;
import java.util.Stack;

public class Question5 {
	public static void main(String[] args) {
		Stack<Double> stack = new Stack<Double>();
		for(int i = 1; i <= 5; i++) {
			stack.push(i+(i/10.0));
		}
		System.out.println("stack => "+stack);
		double[] array = new double[stack.size()];
		for(int i = array.length-1; i >= 0; --i) {
			array[i] = stack.pop();
		}
		System.out.println("array => "+Arrays.toString(array));
		Stack<Double> newStack = new Stack<>();
		for(int i = 0; i < array.length; i++) {
			newStack.push(array[i]);
		}
		System.out.println("stack => "+newStack);
	}
}
