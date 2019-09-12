package GenericsAlgorithmsTest;

import GenericAlghorithm.GenericInsertionSort;
import GenericAlghorithm.IGSort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;


public class GenInsertionSortTest implements IGenSortTest {
    private IGSort insertion = new GenericInsertionSort();


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
