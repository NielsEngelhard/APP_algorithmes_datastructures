package GenericsAlgorithmsTest;

import GenericAlghorithm.GenericQuickSort;
import GenericAlghorithm.IGSort;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.util.Arrays;

public class GenQuickSortTest implements IGenSortTest {

    IGSort quickSort = new GenericQuickSort();

    @Test
    public void testQuickSortSmallInput() {
        quickSort.sortArray(smallRandomInput);
        String stringExpected = Arrays.toString(exResSmall);
        String stringResult = Arrays.toString(smallRandomInput);

        assertEquals(stringExpected, stringResult);
    }

    @Test
    public void testQuickSortSortedInput() {
        quickSort.sortArray(sortedInput);
        String stringExpected = Arrays.toString(exResSorted);
        String stringResult = Arrays.toString(sortedInput);

        assertEquals(stringExpected, stringResult);
    }

    @Test
    public void testQuickSortReversedInput() {
        quickSort.sortArray(reversedInput);
        String stringExpected = Arrays.toString(exResRev);
        String stringResult = Arrays.toString(reversedInput);

        assertEquals(stringExpected, stringResult);
    }

}
