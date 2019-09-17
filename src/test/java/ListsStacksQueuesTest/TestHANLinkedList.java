package ListsStacksQueuesTest;

import ListsStacksQueues.HANLinkedList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class TestHANLinkedList {

    HANLinkedList<String> list = new HANLinkedList<String>();

    @Test
    public void testAddFirstAndGet() {
        for(int i = 0; i < 100; i++) {
            list.addFirst("Object op positie: " + i);
        }

        String valuePos0 = list.get(0);
        String valuePos50 = list.get(50);
        String valuePos99 = list.get(99);

        assertEquals("Object op positie: 99", valuePos0);
        assertEquals("Object op positie: 49", valuePos50);
        assertEquals("Object op positie: 0", valuePos99);
    }

    @Test
    public void testInsert() {
        list.addFirst( "begin object 3");
        list.addFirst( "begin object 2");
        list.addFirst( "begin object 1");
        list.addFirst( "begin object 0");

        list.insert(1, "NEWPOSONE");
        list.insert(3, "NEWPOSTHREE");

        assertEquals("NEWPOSONE", list.get(1));
        assertEquals("NEWPOSTHREE", list.get(3));
    }

    @Test
    public void testRemove() {
        list.addFirst("add pos 5");
        list.addFirst("add pos 4");
        list.addFirst("add pos 3");
        list.addFirst("add pos 2");
        list.addFirst("add pos 1");
        list.addFirst("add pos 0");

        list.delete(3);
        assertEquals("add pos 4", list.get(3));
    }

    @Test
    public void testRemoveFirst() {
        list.addFirst("something 1");
        list.addFirst("something 2");
        list.addFirst("something 3");

        list.removeFirst();

        assertEquals("something 1", list.get(1));
        assertEquals("something 2", list.get(0));
    }


    @Test
    public void testGetSize() {
        list.addFirst("something 1");
        list.addFirst("something 2");
        list.addFirst("something 3");

        assertEquals(3, list.getSize());
    }
}
