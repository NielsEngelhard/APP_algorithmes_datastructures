package ListsStacksQueues;

public class HANLinkedList<T> {

        ListNode<T> headNode;
        ListNode<T> firstPosition;
        private int size;

        public HANLinkedList() {
            headNode = new ListNode<T>(null);
            firstPosition = headNode;
            size = 0;
        }

        public void addFirst(T object) {
            ListNode<T> newNode = new ListNode<T>(object);
            newNode.next = firstPosition;
            firstPosition = newNode;
            size++;
        }

        public void removeFirst() {
            ListNode<T> toDelete = firstPosition;
            if(!isEmpty()) {
                firstPosition = firstPosition.next;
            } else {
                System.out.println("list is empty");
            }
            size--;
        }

        public void add(int index, T value) {
            ListNode<T> toAdd = new ListNode<T>(value);
            ListNode<T> current = firstPosition;
            for(int i = 0; i < index - 1; i++) {
                if (current.next != null) {
                    current = current.next;
                }
            }
            toAdd.next = current.next;
            current.next = toAdd;
            size++;
        }

        public void remove(int index) {
            ListNode<T> current = firstPosition;

            current.next = current.next.next;
            size--;
        }

        public T get(int index) {
            ListNode<T> current = firstPosition;
            for(int i = 0; i <= index - 1; i++) {
                if(current.next != null) {
                    current = current.next;
                } else {
                    System.out.println("position does not exist");
                    return null;
                }
            }
            return current.object;
        }

        public boolean isEmpty() {
            return firstPosition == null;
        }

        public void printList() {
            ListNode<T> current = firstPosition;
            while(current.next != null) {
                System.out.println(current.object);

                current = current.next;
            }
        }

        public int getSize() {
            return size;
        }
    }

    class ListNode<T> {

        public T object;
        public ListNode<T> next;

        public ListNode(T object) {
            this.object = object;
        }

        public String toString() {
            return object.toString();
        }
    }

