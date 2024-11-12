package arraylistandlinkedlist.arraylist;

import java.util.ArrayList;
import java.util.Comparator;

public class Question4 {
	public static void main(String[] args) {
		ArrayList<Integer> randomNumbers = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++) {
			randomNumbers.add((int)(Math.round(Math.random()*100)));
		}
		System.out.println("Random Numbers : "+randomNumbers);
		randomNumbers.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1-o2;
			}
		});
		System.out.println("Sorted numbers : "+randomNumbers);
	}
}
