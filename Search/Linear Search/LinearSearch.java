import org.junit.*;
import static org.junit.Assert.*;

public class LinearSearch {
	
	@Test
	public static int linearSearch(int [] array, int value) {
		int valueIndex = -1;
		
		for (int index = 0; index < array.length; index++) {
			if (array[index] == value) {
				valueIndex = index;
			}
		}
		return valueIndex;
	}
	
	public static void main(String [] args) {
		
		int [] arrayValues = { 1, 4, 6, 7, 12, 13, 15, 18, 19, 20, 22, 24};
		int searchValue = 18;
		
		int position = linearSearch(arrayValues, searchValue);
		
		// Linear Search element 18
		assertEquals(position, 7);
	}
}