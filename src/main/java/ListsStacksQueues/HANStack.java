package ListsStacksQueues;

public class HANStack<T> {
    HANLinkedList<T> list;

    public HANStack() {
        list = new HANLinkedList<T>();
    }

    public void pop() {
        if(isEmpty()) {
            System.out.println("Cant pop because the list is empty");
        } else {
            list.removeFirst();
        }
    }

    public T top() {
        if(isEmpty()) {
            throw new ArrayIndexOutOfBoundsException();
        }
            return list.get(0);
    }

    public void push(T value) {
        list.addFirst(value);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.getSize();
    }

    public String toString() {
        return list.toString();
    }
}
