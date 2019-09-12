package GenericsAlgorithmsTest;

public interface IGenSortTest {

    // input for the sorting algorithms
    Integer[] smallRandomInput = {6,5,43,2,1,32,3};
    Integer[] sortedInput = {1,2,3,4,5,6,7,8};
    Integer[] reversedInput = {90, 80, 33, 11, 10, 9, 8, 3, 1, 0};

    // expected outcome
    Integer[] exResSmall= {1,2,3,5,6,32,43};
    Integer[] exResSorted= {1,2,3,4,5,6,7,8};
    Integer[] exResRev= {0, 1, 3, 8, 9, 10, 11, 33, 80, 90};
}
