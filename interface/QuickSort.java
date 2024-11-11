package interfaces;

public class QuickSort implements Sortable{
    void quickSort(int[] arr, int start, int end){
        if(start < end){
            int p = partition(arr, start, end);
            quickSort(arr, start, p-1);
            quickSort(arr, p+1, end); 
        }
    }
    int partition(int[] arr, int left, int right){
        int pivot = arr[right]; 
        int temp;
        int i = left-1; 
        int j = left; 
        while(j < right){
            if(pivot > arr[j]){ 
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            j++;
        }
        temp = arr[i+1];
        arr[i+1] = arr[right];
        arr[right] = temp;
        return i+1; 
    }
	@Override
	public void sort(int[] arr) {
		quickSort(arr, 0, arr.length-1);
	}
}
