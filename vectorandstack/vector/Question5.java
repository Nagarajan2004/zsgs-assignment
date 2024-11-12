package vectorandstack.vector;

import java.util.Arrays;
import java.util.Vector;

public class Question5 {
	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>();
		vector.add("red");
		vector.add("green");
		vector.add("blue");
		vector.add("yellow");
		String[] array = new String[vector.size()];
		for(int i = 0; i < array.length; i++) {
			array[i] = vector.get(i);
		}
		System.out.println("array => "+Arrays.toString(array));
		Vector<String> newVector = new Vector<String>();
		for(String s : array) {
			newVector.add(s);
		}
		System.out.println("vector => "+newVector);
	}
}
