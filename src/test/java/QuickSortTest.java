import algorithms.InsertionSort;
import algorithms.QuickSort;
import algorithms.Sort;
import junit.framework.TestCase;

import java.util.Arrays;

public class QuickSortTest extends TestCase {
    int[] smallRandomInput, sortedInput, reversedInput;
    Sort quickSort;

    public void setUp() {
        smallRandomInput = new int[] {6,5,43,2,1,32,3};
        sortedInput = new int[] {1,2,3,4,5,6,7,8};
        reversedInput = new int[] {90, 80, 33, 11, 10, 9, 8, 3, 1, 0};
        quickSort = new QuickSort();
    }

    public void testQuickSortSmallInput() {
        int[] expectedResult = {1,2,3,5,6,32,43};

        quickSort.sortArray(smallRandomInput);
        String stringExpected = Arrays.toString(expectedResult);
        String stringResult = Arrays.toString(smallRandomInput);

        assertEquals(stringExpected, stringResult);
    }

    public void testQuickSortSortedInput() {
        int[] expectedResult = {1,2,3,4,5,6,7,8};

        quickSort.sortArray(sortedInput);
        String stringExpected = Arrays.toString(expectedResult);
        String stringResult = Arrays.toString(sortedInput);

        assertEquals(stringExpected, stringResult);
    }

    public void testQuickSortReversedInput() {
        int[] expectedResult = {0, 1, 3, 8, 9, 10, 11, 33, 80, 90};

        quickSort.sortArray(reversedInput);
        String stringExpected = Arrays.toString(expectedResult);
        String stringResult = Arrays.toString(reversedInput);

        assertEquals(stringExpected, stringResult);
    }
}
