package map;

import java.util.HashMap;
import java.util.Map;

public class Question1 {
	public static void main(String[] args) {
		HashMap<String, Integer> people = new HashMap<>();
		people.put("Alice", 30);
		people.put("Bob", 25);
		people.put("Charlie", 35);
		people.put("Diana", 28);
		people.put("Edward", 40);
		System.out.println("Charlie age => "+people.get("Charlie"));
		for(Map.Entry<String, Integer> entry : people.entrySet()) {
			System.out.println(entry.getKey() +" "+ entry.getValue());
		}
	}
}
