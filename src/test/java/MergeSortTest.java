import algorithms.MergeSort;
import algorithms.Sort;
import junit.framework.TestCase;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MergeSortTest extends TestCase {

    private int[] smallRandomInput, sortedInput, reversedInput;
    private Sort mergeSort;

    protected void setUp() {
        smallRandomInput = new int[] {6,5,43,2,1,32,3};
        sortedInput = new int[] {1,2,3,4,5,6,7,8};
        reversedInput = new int[] {90, 80, 33, 11, 10, 9, 8, 3, 1, 0};
        mergeSort = new MergeSort();
    }

    public void testSmallInput() {
        int[] expectedResult= {1,2,3,5,6,32,43};

        mergeSort.sortArray(smallRandomInput);
        String stringResult = Arrays.toString(smallRandomInput);
        String stringExpected = Arrays.toString(expectedResult);

        assertEquals(stringExpected, stringResult);
    }

    public void testSortedInput() {
        int[] expectedResult= {1,2,3,4,5,6,7,8};

        mergeSort.sortArray(sortedInput);
        String stringResult = Arrays.toString(sortedInput);
        String stringExpected = Arrays.toString(expectedResult);

        assertEquals(stringExpected, stringResult);
    }

    public void testReversedInput() {
        int[] expectedSortedResult= {0, 1, 3, 8, 9, 10, 11, 33, 80, 90};

        mergeSort.sortArray(reversedInput);
        String stringResult = Arrays.toString(reversedInput);
        String stringExpected = Arrays.toString(expectedSortedResult);

        assertEquals(stringExpected, stringResult);
    }
}
