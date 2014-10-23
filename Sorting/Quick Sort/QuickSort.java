public class QuickSort {
	
	public static void quickSort(int [] array, int left, int right) {
		int index = partition(array, left, right);
		
		if (left < index - 1) {
			quickSort(array, left, index - 1);
		} 
		if (right > index) {
			quickSort(array, index, right);
		}
	}
	
	private static int partition(int [] array, int left, int right) {
		
		int i = left;
		int j = right;
		int temp;
		int pivot = array[(left + right) / 2];
		
		while (i <= j) {
			while (array[i] < pivot) {
				i++;
			}
			while (array[j] > pivot) {
				j--;
			}
			if (i <= j) {
				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				
				i++;
				j--;
			}
		}
		return i;
	}
	
	public static void main(String [] args) {
		
		int [] arrayValues = { 1, 32, 6, 7, 12, 17, 15, 11, 19, 23, 22, 24};
		quickSort(arrayValues, 0, arrayValues.length - 1);
		
		System.out.println("============");
		System.out.println(" QUICK SORT ");
		System.out.println("============");
		
		for (int index : arrayValues) {
			System.out.print(index + " ");
		}
		
		System.out.println();
	}
}