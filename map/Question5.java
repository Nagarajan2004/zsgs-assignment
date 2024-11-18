package map;

import java.util.HashMap;
import java.util.Map;

public class Question5 {
	public static void main(String[] args) {
		HashMap<Character, Integer> m1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> m2 = new HashMap<Character, Integer>();
		m1.put('a', 1);
		m1.put('b', 2);
		m2.put('b', 3);
		m2.put('c', 4);
		for(Map.Entry<Character, Integer> entry : m2.entrySet()) {
			m1.put(entry.getKey(), entry.getValue());
		}
		System.out.println(m1);
	}
}
