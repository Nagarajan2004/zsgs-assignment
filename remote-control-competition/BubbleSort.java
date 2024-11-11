package interfaces;

public class BubbleSort implements Sortable{
	@Override
	public void sort(int[] arr) {
		int temp;
		boolean swapHappend = false;
		for (int i = arr.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapHappend = true;
                }
            }
            if(!swapHappend) break;
        }
	}
}