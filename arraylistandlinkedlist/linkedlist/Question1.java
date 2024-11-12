package arraylistandlinkedlist.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class Question1 {
	public static void main(String[] args) {
		LinkedList<Integer> numbers = new LinkedList<Integer>(List.of(5, 10, 15, 20, 25));
		System.out.println("first element ==> "+numbers.getFirst());
		System.out.println("last element ==> "+numbers.getLast());
	}
}
