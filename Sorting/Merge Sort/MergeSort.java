public class MergeSort {
	
	private static int [] numbers;
	private static int [] helper;
	private static int value;
	
	public static void sort(int [] array) {
		numbers = array;
		value = array.length;
		helper = new int[value];

		mergesort(0, value - 1);
	}
	
	private static void mergesort(int low, int high) {
		if (low < high) {
			int middle = low + (high - low) / 2;
			mergesort(low, middle);
			mergesort(middle + 1, high);
			merge(low, middle, high);
		}
	}
	
	private static void merge(int low, int middle, int high) {
		for (int i = low; i <= high; i++) {
			helper[i] = numbers[i];
		}
		
		int i = low;
		int j = middle + 1;
		int k = low;
		
		while (i <= middle && j <= high) {
			
			if (helper[i] <= helper[j]) {
				numbers[k] = helper[i];
				i++;
			} else {
				numbers[k] = helper[j];
				j++;
			}
			k++;
		}
		
		while (i <= middle) {
			numbers[k] = helper[i];
			k++;
			i++;
		}
	}
	
	public static void main(String [] args) {
		
		int [] arrayValues = { 1, 32, 6, 7, 12, 17, 15, 11, 19, 23, 22, 24};
		sort(arrayValues);
		
		System.out.println("============");
		System.out.println(" MERGE SORT ");
		System.out.println("============");
		
		for (int index : arrayValues) {
			System.out.print(index + " ");
		}
		
		System.out.println();
	}
}