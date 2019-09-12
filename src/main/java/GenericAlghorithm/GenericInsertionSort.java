package GenericAlghorithm;

public class GenericInsertionSort implements IGSort {

    public <T extends Comparable<T>> void sortArray(T[] list) {
        int j;
        T tmp, key;
        for(int i = 1; i < list.length; i++) {
            key = list[i];
            j = i - 1;
            while(j > -1 && key.compareTo(list[j]) < 0) {
                tmp =  list[j];
                list[j] = list[j + 1];
                list[j + 1] = tmp;
                j--;
            }
        }
    }
}

