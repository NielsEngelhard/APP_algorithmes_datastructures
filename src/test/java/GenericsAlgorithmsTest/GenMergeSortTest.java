package GenericsAlgorithmsTest;

import GenericAlghorithm.GenericMergeSort;
import GenericAlghorithm.IGSort;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class GenMergeSortTest implements IGenSortTest {
    private IGSort mergeSort = new GenericMergeSort();

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
