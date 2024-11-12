package vectorandstack.vector;

import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class Question2 {
	public static void main(String[] args) {
		Vector<String> fruits = new Vector<String>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("cherry");
		fruits.add("date");
		fruits.add("fig");
		Enumeration<String> enumeration = fruits.elements();
		System.out.print("[");
		while(enumeration.hasMoreElements()) {
			System.out.print(enumeration.nextElement()+", ");
		}
		System.out.println(']');
		ListIterator<String> it = fruits.listIterator();
		while(it.hasNext()) {
			if(it.next().equals("cherry")) {
				it.set("coconut");
			}
		}
		System.out.println(fruits);
	}
}
