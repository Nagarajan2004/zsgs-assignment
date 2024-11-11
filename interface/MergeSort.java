package interfaces;

public class MergeSort implements Sortable{
    void mergeSort(int[] arr, int low, int high){
        if(low < high){
            int mid = (low+high)/2; 
            mergeSort(arr, low, mid);    
            mergeSort(arr, mid+1, high); 
            merge(arr, low, mid, high);
        }
    }
    void merge(int[] arr, int low, int mid, int high){
        int[] temp = new int[high-low+1];
        int left = low; 
        int right = mid+1;
        int tempIndex = 0;
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp[tempIndex++] = arr[left++];
            } else {
                temp[tempIndex++] = arr[right++];
            }
        }
        while (left<=mid){  
            temp[tempIndex++] = arr[left++];
        }
        while (right<=high){
            temp[tempIndex++] = arr[right++];
        }
        for(int i = low; i <= high; i++){ 
            arr[i] = temp[i-low];
        }
    }
	@Override
	public void sort(int[] arr) {
		mergeSort(arr, 0, arr.length-1);
	}
}
