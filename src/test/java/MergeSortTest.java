import algorithms.MergeSort;
import junit.framework.TestCase;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MergeSortTest extends TestCase {

    private int[] smallRandomInput, sortedInput, reversedInput;
    private MergeSort mergeSort;

    protected void setUp() {
        smallRandomInput = new int[] {6,5,43,2,1,32,3};
        sortedInput = new int[] {1,2,3,4,5,6,7,8};
        reversedInput = new int[] {90, 80, 33, 11, 10, 9, 8, 3, 1, 0};
        mergeSort = new MergeSort();
    }

    public void testSmallInput() {
        //arrange
        int[] expectedResult= {1,2,3,5,6,32,43};
        //act
        int[] result = mergeSort.mergeSort(smallRandomInput, smallRandomInput.length-1);
        String stringResult = Arrays.toString(result);
        String stringExpected = Arrays.toString(expectedResult);
        //assert
        assertEquals(stringExpected, stringResult);
    }

    public void testSortedInput() {
        //arrange
        int[] expectedResult= {1,2,3,4,5,6,7,8};
        //act
        int[] result = mergeSort.mergeSort(sortedInput, sortedInput.length - 1);
        String stringResult = Arrays.toString(result);
        String stringExpected = Arrays.toString(expectedResult);
        //assert
        assertEquals(stringExpected, stringResult);
    }

    public void testReversedInput() {
        //arrange
        int[] expectedSortedResult= {0, 1, 3, 8, 9, 10, 11, 33, 80, 90};
        int[] result = mergeSort.mergeSort(reversedInput, reversedInput.length - 1);
        String stringResult = Arrays.toString(result);
        String stringExpected = Arrays.toString(expectedSortedResult);
        //assert
        assertEquals(stringExpected, stringResult);
    }
}
