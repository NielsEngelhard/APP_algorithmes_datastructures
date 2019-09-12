import algorithms.MergeSort;
import algorithms.Sort;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;


public class MergeSortTest implements ISortTest {
    private Sort mergeSort = new MergeSort();

    @Test
    public void testSmallInput() {
        mergeSort.sortArray(smallRandomInput);
        String stringResult = Arrays.toString(smallRandomInput);
        String stringExpected = Arrays.toString(exResSmall);

        assertEquals(stringExpected, stringResult);
    }

    @Test
    public void testSortedInput() {
        mergeSort.sortArray(sortedInput);
        String stringResult = Arrays.toString(sortedInput);
        String stringExpected = Arrays.toString(exResSorted);

        assertEquals(stringExpected, stringResult);
    }

    @Test
    public void testReversedInput() {

        mergeSort.sortArray(reversedInput);
        String stringResult = Arrays.toString(reversedInput);
        String stringExpected = Arrays.toString(exResRev);

        assertEquals(stringExpected, stringResult);
    }
}
