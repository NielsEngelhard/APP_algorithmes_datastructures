package ListsStacksQueues;

public class OwnGenericArrayList<T> {

        private Object[] list;
        private int pointerNewValue = 0;

        public OwnGenericArrayList() {

            list = new Object[20];
        }

        // if the user wants to set a default amount at the beginning
        public OwnGenericArrayList(int amount) {
            list = new Object[amount];
        }

        public void add(int value) {
            // if the ArrayList is full, the capacity of the array is x2 and the current values are added
            if (pointerNewValue == list.length) {
                Object[] tmpList = list;
                list = new Object[tmpList.length * 2];
                System.out.println("new list length: " + list.length);

                // create new with x2 and write old values in new
                if (list.length - 1 >= 0) System.arraycopy(tmpList, 0, this.list, 0, this.list.length - 1);
            }
            System.out.println("list length: " + list.length);
            list[pointerNewValue] = value;
            pointerNewValue++;
        }

        public Object get(int index) {
            return list[index];
        }

        public void set(int index, Object value) {
            list[index] = value;
        }
}


