package arraylistandlinkedlist.arraylist;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.List;

public class Question2 {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>(List.of(10, 20, 30, 40, 50));
		ListIterator<Integer> it = numbers.listIterator();
		while(it.hasNext()) {
			if(it.next() > 30) {
				it.remove();
			}
		}
		System.out.println(numbers);
	}
}
