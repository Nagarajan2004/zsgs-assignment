package arraylistandlinkedlist.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Question5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String>  arrayList = new ArrayList<String>(List.of("apple", "banana", "cherry"));
		System.out.println("arrayList ==> "+arrayList);
		String[] array = convertArray(arrayList);
		System.out.println("array ==> "+Arrays.toString(array));
		sc.close();
	}
	private static String[] convertArray(ArrayList<String> arrayList) {
		String[] arr = new String[arrayList.size()];
		for(int i = 0; i < arrayList.size(); i++) {
			arr[i] = arrayList.get(i);
		}
		return arr;
	}
}
