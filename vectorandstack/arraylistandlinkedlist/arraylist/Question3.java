package arraylistandlinkedlist.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Question3 {
	private ArrayList<Character> characterList;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Question3 q = new Question3();
		q.characterList = new ArrayList<>();
		System.out.println("Enter ten different character : ");
		for(int i = 0; i < 10; i++) {
			q.characterList.add(sc.next().charAt(0));
		}
		System.out.println("enter a chracter to find in the array : ");
		char ch = sc.next().charAt(0);
		System.out.printf("index of %c is ==> %d",ch,q.findIndex(ch));
		sc.close();
	}
	public int findIndex(char ch) {
		for(int i = 0; i < characterList.size(); i++) {
			if(ch == characterList.get(i)) return i;
		}
		return -1;
	}
}
