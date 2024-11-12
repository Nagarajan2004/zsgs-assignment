package arraylistandlinkedlist.linkedlist;

class UserLinkedList<T>{
	Node first;
	Node last;
	class Node{
		T ch;
		Node next;
		Node(){}
		Node(T ch){
			this.ch = ch;
		}
	}
	public void add(T e) {
		if(first == null) {
			first = new Node(e);
			last = first;
		} else {
			last.next = new Node(e);
			last = last.next;
		}
	}
	public void reverse() {
		if(first == null) {
			System.out.println("list is empty");
			return;
		}
		if(first.next == null) {
			return;
		}
		last = first;
		Node prev = null;
		Node curr = first;
		Node next = first.next;
		while(curr.next != null) {
			curr.next = prev;
			prev = curr;
			curr = next;
			next = next.next;
		}
		curr.next = prev;
		first = curr;
	}
	
	@Override
	public String toString() {
		StringBuilder list = new StringBuilder();
		list.append("[");
		Node temp = first;
		while(temp.next != null) {
			list.append(temp.ch+", ");
			temp = temp.next;
		}
		list.append(temp.ch+"]");
		return list.toString();
	}
}

public class Question5 {
	public static void main(String[] args) {
		UserLinkedList<Character> characters = new UserLinkedList<>();
		characters.add('A');
		characters.add('B');
		characters.add('C');
		characters.add('D');
		characters.add('E');
		System.out.println(characters);
		characters.reverse();
		System.out.println(characters);
	}
}
