package ListsStacksQueues;

public class OwnArrayList<T> {

    public T[] theArray;
    private int pointerNewValue = 0;
    private static final int DEFAULT_CAPACITY = 2;

    public OwnArrayList() {
        theArray = (T[]) new Object[DEFAULT_CAPACITY];
    }

    // if the user wants to set a default amount at the beginning
    public OwnArrayList(int capacity) {
        theArray = (T[]) new Object[capacity];
    }

    public void add(T value) {
        // if the ArrayList is full, the capacity of the array is x2 and the current values are added
        if (pointerNewValue + 1 == theArray.length) {
            System.out.println("GOING TO DOUBLE");
            doubleArray();
            System.out.println("GOING TO DOUBLED");
            System.out.println("ARRAY LENGTH: " + theArray.length);
        }
        System.out.println("ADD");
        theArray[pointerNewValue] = value;
        pointerNewValue++;
    }

    public T get(int index) {
        return theArray[index];
    }

    public void set(int index, T value) {
        theArray[index] = value;
    }

    private void doubleArray() {
        T[] tmpArray = theArray;
        theArray = (T[]) new Object[tmpArray.length * 2];
        System.arraycopy(tmpArray, 0, theArray, 0, tmpArray.length);
    }

    public static void main(String[] args) {
        OwnArrayList<Integer> l = new OwnArrayList<Integer>(2);
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println("POST: " + l.get(2));
    }
}
