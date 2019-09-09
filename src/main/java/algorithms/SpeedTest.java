package algorithms;

public class SpeedTest {

    private static long startTimer() {
        return System.nanoTime();
    }

    private static long stopTimer(long startTime) {
        return System.nanoTime() - startTime;
    }

    public static void main(String[] args) {
        Sort sort;
        long start, duration;
        int[] smallInput = {6,54,3,21,2,3,12,2};
        int[] sortedInput = {1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,4,4,4,4,4,4,4,4,4,5,5,5,5,5,5,5,5,5,5,6,6,6,6,6,6,6,6,6,
        7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,10,10,10};
        int[] bigInput = {1,2,4,324,234,4,75,765,4332,46,43,3,23,5,6,3,5,43,7,3,5,65,6,4,6,4,6,3,3,4,656,4,5,
                1,2,4,324,234,4,75,765,4332,46,43,3,23,5,6,3,5,43,7,3,5,65,6,4,6,4,6,3,3,4,656,4,5,
                1,2,4,324,234,4,75,765,4332,46,43,3,23,5,6,3,5,43,7,3,5,65,6,4,6,4,6,3,3,4,656,4,5,
                1,2,4,324,234,4,75,765,4332,46,43,3,23,5,6,3,5,43,7,3,5,65,6,4,6,4,6,3,3,4,656,4,5,
                1,2,4,324,234,4,75,765,4332,46,43,3,23,5,6,3,5,43,7,3,5,65,6,4,6,4,6,3,3,4,656,4,5,
                1,2,4,324,234,4,75,765,4332,46,43,3,23,5,6,3,5,43,7,3,5,65,6,4,6,4,6,3,3,4,656,4,5,
                1,2,4,324,234,4,75,765,4332,46,43,3,23,5,6,3,5,43,7,3,5,65,6,4,6,4,6,3,3,4,656,4,5,
                1,2,4,324,234,4,75,765,4332,46,43,3,23,5,6,3,5,43,7,3,5,65,6,4,6,4,6,3,3,4,656,4,5};



        int[] input = bigInput;

        // INSERTION SORT
        sort = new InsertionSort();
        start = startTimer();
        sort.sortArray(input);
        duration = stopTimer(start);
        System.out.println("insertionSort time: " + duration + " nano seconds");

        // MERGE SORT
        sort = new MergeSort();
        start = startTimer();
        sort.sortArray(input);
        duration = stopTimer(start);
        System.out.println("MergeSort time    : " + duration + " nano seconds");

        // QUICK SORT
        sort = new QuickSort();
        start = startTimer();
        sort.sortArray(input);
        duration = stopTimer(start);
        System.out.println("QuickSort time    : " + duration + " nano seconds");
    }
}
