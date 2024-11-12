package arraylistandlinkedlist.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class Question3 {
	public static void main(String[] args) {
		LinkedList<Integer> numbers = new LinkedList<Integer>(List.of(1,2,3,4,5,6,7,8,9,10));
		System.out.println(numbers);
		numbers.remove(2);
		numbers.removeLast();
		System.out.println("remove third element and last element ==> "+numbers);
	}
}
