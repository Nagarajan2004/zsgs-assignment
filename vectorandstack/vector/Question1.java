package vectorandstack.vector;

import java.util.Vector;

public class Question1 {
	public static void main(String[] args) {
		Vector<Integer> number = new Vector<Integer>();
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(40);
		number.add(50);
		System.out.println(number.get(2));
		System.out.println(number);
	}
}
