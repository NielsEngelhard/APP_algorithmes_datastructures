import algorithms.InsertionSort;
import algorithms.QuickSort;
import junit.framework.TestCase;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class QuickSortTest extends TestCase {
    int[] smallRandomInput, sortedInput, reversedInput;
    QuickSort quickSort;

    public void setUp() {
        smallRandomInput = new int[] {6,5,43,2,1,32,3};
        sortedInput = new int[] {1,2,3,4,5,6,7,8};
        reversedInput = new int[] {90, 80, 33, 11, 10, 9, 8, 3, 1, 0};
        quickSort = new QuickSort();
    }

    public void testQuickSortSmallInput() {
        System.out.println("test small input QuickSort");
        System.out.println("before  : " + Arrays.toString(smallRandomInput));
        int[] expectedResult = {1,2,3,5,6,32,43};
        quickSort.quickSort(smallRandomInput);

        String stringExpected = Arrays.toString(expectedResult);
        String stringResult = Arrays.toString(smallRandomInput);
        System.out.println("expected: " + stringExpected);
        System.out.println("result  : " + stringExpected);
        System.out.println();
        assertEquals(stringExpected, stringResult);
    }

    public void testQuickSortSortedInput() {
        System.out.println("test sorted input QuickSort");
        System.out.println("before  : " + Arrays.toString(sortedInput));
        int[] expectedResult = {1,2,3,4,5,6,7,8};
        quickSort.quickSort(sortedInput);

        String stringExpected = Arrays.toString(expectedResult);
        String stringResult = Arrays.toString(sortedInput);
        System.out.println("expected: " + stringExpected);
        System.out.println("result  : " + stringExpected);
        System.out.println();
        assertEquals(stringExpected, stringResult);
    }

    public void testQuickSortReversedInput() {
        System.out.println("test reversed input QuickSort");
        System.out.println("before  : " + Arrays.toString(reversedInput));
        int[] expectedResult = {0, 1, 3, 8, 9, 10, 11, 33, 80, 90};
        quickSort.quickSort(reversedInput);

        String stringExpected = Arrays.toString(expectedResult);
        String stringResult = Arrays.toString(reversedInput);
        System.out.println("expected: " + stringExpected);
        System.out.println("result  : " + stringExpected);
        System.out.println();
        assertEquals(stringExpected, stringResult);
    }
}
