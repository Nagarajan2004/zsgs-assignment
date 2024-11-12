package arraylistandlinkedlist.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class Question4 {
	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<String>(List.of("Alice", "Bob", "Charlie", "Diana"));
		System.out.println("numes in queue ==> "+names);
		names.removeFirst();
		names.removeFirst();
		System.out.println("after remove two names ==> "+names);
	}
}
