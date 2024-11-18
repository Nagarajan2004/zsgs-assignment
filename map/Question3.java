package map;

import java.util.HashMap;

public class Question3 {
	public static void main(String[] args) {
		HashMap<String, Integer> students = new HashMap<String, Integer>();
		students.put("John", 85);
		students.put("jane", 92);
		students.put("Tom", 76);
		students.put("Lucy", 89);
		if(students.containsKey("Tom")) {
			students.remove("Tom");
		}
		System.out.println(students);
	}
}
