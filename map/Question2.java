package map;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Question2 {
	public static void main(String[] args) {
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("banana", 2);
		treeMap.put("apple", 5);
		treeMap.put("cherry", 7);
		treeMap.put("date", 3);
		Iterator<Map.Entry<String, Integer>> itr = treeMap.entrySet().iterator();
		while(itr.hasNext()) {
			Entry<String, Integer> entry = itr.next();
			System.out.println(entry.getKey() +" "+entry.getValue());
		}
	}
}
