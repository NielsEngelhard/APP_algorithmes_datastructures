package ListsStacksQueues;

public class HANStack<T> {
    private HANLinkedList<T> theList;
    private static final int DEFAULT_CAPACITY = 10;

    public HANStack() {
        theList = new HANLinkedList<T>();
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Cant pop, stack is empty");
        }
        theList.removeFirst();
    }

    public T top() {
        if (isEmpty()) {
            return null;
        }
        return theList.get(0);
    }

    public void push(T x) {
        theList.addFirst(x);
    }

    public int getSize() {
        return theList.getSize();
    }

    public boolean isEmpty() {
        return theList.isEmpty();
    }

    public void printStack() {
        theList.printList();
    }
}
