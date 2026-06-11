package PreFinalQuiz;

public class quickSort {
	
	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	static void medianOFThree(int[] arr, int low, int high) {
		int mid = low + (high - low) / 2;
		
		if (arr[low] > arr[mid]) {
			swap(arr, low, mid);
		}
		if (arr[mid] > arr[high]) {
			swap(arr, mid, high);
		}
		if (arr[low] > arr[mid]) {
			swap(arr, low, mid);
		}
		swap(arr, mid, high);
	}
	
	static int partition(int[] arr, int  low, int high) {
		medianOFThree(arr, low, high);
		
		int pivot = arr[high];
		int  i = low - 1;
		
		for (int j = low; j <= high - 1; j++) {
			if (arr[j] < pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i+1, high);
		return (i +1); 
	}
	
	static void quickAlg(int[] arr,int low,int high) {
		if (low < high) {
			int pi = partition(arr, low, high);
			quickAlg(arr, low, pi - 1);
			quickAlg(arr, pi+1, high);
		}
	}
	
	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = {10, 7, 8, 9, 1, 5};
		int N = arr.length;
		System.out.print("Data sebelum diurutkan : ");
		printArr(arr);
		
		quickAlg(arr, 0, N-1);
		
		System.out.print("Data setelah diururtkan : ");
		printArr(arr);
	}
	
	
}
