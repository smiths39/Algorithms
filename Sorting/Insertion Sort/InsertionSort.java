public class InsertionSort {
	
	public static void insertionSort(int [] array) {
		for (int i = 1; i < array.length; i++) {
			int index = array[i];
			int j = i;
			
			while (j > 0 && array[j - 1] > index) {
				array[j] = array[j - 1];
				j--;
			}
			array[j] = index;
		}
	}
	
	public static void main(String [] args) {
		
		int [] arrayValues = { 1, 32, 6, 7, 12, 17, 15, 11, 19, 23, 22, 24};
		insertionSort(arrayValues);
		
		System.out.println("================");
		System.out.println(" INSERTION SORT ");
		System.out.println("================");
		
		for (int index : arrayValues) {
			System.out.print(index + " ");
		}
		
		System.out.println();
	}
}