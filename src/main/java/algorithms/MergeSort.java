package algorithms;

import java.util.*;

public class MergeSort {
    public static void main(String[] args) {

    }

    public int[] mergeSort(int[] arr, int size) {
        if (size > 1) {
            int mid = size / 2;
            int[] first = Arrays.copyOfRange(arr, 0, mid); // left half
            first = mergeSort(first, mid); // recursive call for first half array


            int[] second = Arrays.copyOfRange(arr, mid, size); // right side
            second = mergeSort(second, size - mid); // recursive call for second half array

            // merge the two arrays
            arr = mergeArrays(first, second, mid, size - mid);
        }
        return arr;
    }

    private int[] mergeArrays(int first[], int second[], int n, int m) // respectively
    {
        int arr[] = new int[n + m];
        int i = 0, f = 0, s = 0;
        while (f < n && s < m) {
            if (first[f] < second[s])
                arr[i++] = first[f++];
            else
                arr[i++] = second[s++];
        }
        while (f < n)
            arr[i++] = first[f++];
        while (s < m)
            arr[i++] = second[s++];
        return arr;
    }

}
