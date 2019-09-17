package ListsStacksQueues;

public class HANLinkedList<T> {

        ListNode<T> headNode;
        ListNode<T> lastPosition;
        private int size;

        public HANLinkedList() {
            headNode = new ListNode<T>(null);
            lastPosition = headNode;
        }

        public void addFirst(T value) {
            ListNode<T> toAdd = new ListNode<T>(value);
            if(headNode.next == null) {
                lastPosition = toAdd;
            }
            toAdd.next = headNode.next;
            headNode.next = toAdd;
            size++;
        }

        public void removeFirst() {
            headNode.next = headNode.next.next;
            size--;
        }

        public void insert(int index, T value) {
            ListNode<T> toAdd = new ListNode<T>(value);
            ListNode<T> current = headNode;
            for(int i = 0; i < index; i++) {
                current = current.next;
            }
            toAdd.next = current.next;
            current.next = toAdd;
            size++;
        }

        public void delete(int index) {
            ListNode<T> current = headNode;
            for(int i = 0; i < index; i++) {
                current = current.next;
            }
            current.next = current.next.next;
            size--;
        }

        public T get(int index) {
            ListNode<T> current = headNode.next;
            for(int i = 0; i < index; i++) {
                current = current.next;
            }
            return current.value;
        }

        public int getSize() {
            return size;
        }

        public String toString() {
            ListNode<T> current = headNode;
            String toReturn = "";

            while(current.next != null) {
                current.next = current.next.next;
                toReturn = toReturn + current.value + ",";
            }

            return toReturn;
        }

        public boolean isEmpty() {
            return headNode.next == null;
        }

    }

    class ListNode<T> {

        public T value;
        public ListNode<T> next = null;

        public ListNode(T value) {
            this.value = value;
        }

        public String toString() {
            return value.toString();
        }
    }

