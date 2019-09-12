import algorithms.InsertionSort;
import algorithms.Sort;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.util.Arrays;

// AAA unit-test -> arrange - act -assert
public class InsertionSortTest implements ISortTest {
    private Sort insertion = new InsertionSort();


    @Test
    public void testSmallInput() {
        insertion.sortArray(smallRandomInput);
        String stringExpected = Arrays.toString(exResSmall);
        String stringResult = Arrays.toString(smallRandomInput);

        assertEquals(stringExpected, stringResult);
    }

    @Test
    public void testSortedInput() {
        insertion.sortArray(sortedInput);
        String stringResult = Arrays.toString(sortedInput);
        String stringExpected = Arrays.toString(exResSorted);

        assertEquals(stringExpected, stringResult);
    }

    @Test
    public void testReversedInput() {
        insertion.sortArray(reversedInput);
        String stringResult = Arrays.toString(reversedInput);
        String stringExpected = Arrays.toString(exResRev);

        assertEquals(stringExpected, stringResult);
    }
}
