package interfaces;

import java.util.Arrays;

public class Sorting{
	public static void main(String[] args) {
		Sortable sort;
		int[] temp;
		int[] arr = {9, 4, 5, 1, 7, 3};
		
		sort = new BubbleSort();
		temp = Arrays.copyOf(arr, arr.length);
		sort.sort(temp);
		System.out.println("Bobble Sort : "+Arrays.toString(temp));
		
		sort = new QuickSort();
		temp = Arrays.copyOf(arr, arr.length);
		sort.sort(temp);
		System.out.println("Quick Sort : "+Arrays.toString(temp));
		
		sort = new MergeSort();
		temp = Arrays.copyOf(arr, arr.length);
		sort.sort(temp);
		System.out.println("Merge Sort : "+Arrays.toString(temp));
	}
}
