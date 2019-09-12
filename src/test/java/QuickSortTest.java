import algorithms.QuickSort;
import algorithms.Sort;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;

public class QuickSortTest implements ISortTest {
    Sort quickSort = new QuickSort();

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
