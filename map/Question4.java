package map;

import java.util.HashMap;
import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Character, Integer> freq = new HashMap<Character, Integer>();
		System.out.println("Enter a String : ");
		String s = sc.next();
		for(int i = 0; i < s.length(); i++) {
			freq.put(s.charAt(i), freq.getOrDefault(s.charAt(i), 0)+1);
		}
		System.out.println(freq);
	}
}
