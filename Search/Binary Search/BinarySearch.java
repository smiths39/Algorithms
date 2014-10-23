import org.junit.*;
import static org.junit.Assert.*;

public class BinarySearch {
	
	@Test
	public static int binarySearch(int [] array, int leftIndex, int rightIndex, int value) {
		
		if (leftIndex == rightIndex && array[leftIndex] != value) {
			return -1;
		}

		int middleIndex = leftIndex + (rightIndex - leftIndex) / 2;
		
		if (array[middleIndex] == value) {
			return middleIndex;
		} else if (array[middleIndex] > value) {
			return binarySearch(array, leftIndex, middleIndex, value);
		} else {
			return binarySearch(array, middleIndex + 1, rightIndex, value);
		}
	}
	
	public static void main(String [] args) {
		
		int [] arrayValues = { 1, 4, 6, 7, 12, 13, 15, 18, 19, 20, 22, 24};
		int searchValue = 18;
		
		int position = binarySearch(arrayValues, 0, arrayValues.length - 1, searchValue);
		
		// Binary Search element 18
		assertEquals(position, 7);
	}
}
