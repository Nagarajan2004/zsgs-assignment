package arraylistandlinkedlist.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> fruits = new ArrayList<String>(); 
		System.out.println(String.class);
		System.out.println("Enter the list of 5 fruits : ");
		for(int i = 0; i < 5; i++) {
			fruits.add(scan.next());
		}
		System.out.println("Third fruit ==> "+fruits.get(2));
		scan.close();
	}
}
