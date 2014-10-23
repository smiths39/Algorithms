public class SelectionSort {
	
	public static void selectionSort(int [] array) {
		
		for (int i = 0; i < array.length; i++) {
			
			int minIndex = i;
			
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[minIndex]) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				int temp = array[i];
				array[i] = array[minIndex];
				array[minIndex] = temp;
			}
		}
	}
	
	public static void main(String [] args) {
		
		int [] arrayValues = { 1, 32, 6, 7, 12, 17, 15, 11, 19, 23, 22, 24};
		selectionSort(arrayValues);
		
		System.out.println("================");
		System.out.println(" SELECTION SORT ");
		System.out.println("================");
		
		for (int index : arrayValues) {
			System.out.print(index + " ");
		}
		
		System.out.println();
	}
}