package arraylistandlinkedlist.linkedlist;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Question2 {
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>(List.of("one", "two", "three", "four", "five"));
		ListIterator<String> it = linkedList.listIterator();
		while(it.hasNext()) {
			if(it.next().equals("three")) {
				it.set("THREE");
			}
		}
		System.out.println(linkedList);
	}
}
