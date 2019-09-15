package ListsStacksQueuesTest;

import ListsStacksQueues.OwnArrayList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestOwnArrayList {

    private OwnArrayList<Integer> ownArrayList = new OwnArrayList<Integer>();


    @Test
    public void testAddGetValues() {
        ownArrayList.add(1);
        ownArrayList.add(2);
        ownArrayList.add(6);
        ownArrayList.add(5);
        assertEquals(Integer.valueOf(1), ownArrayList.get(0));
        assertEquals(Integer.valueOf(2), ownArrayList.get(1));
        assertEquals(Integer.valueOf(6), ownArrayList.get(2));
        assertEquals(Integer.valueOf(5), ownArrayList.get(3));
        assertEquals(Integer.valueOf(0), ownArrayList.get(4));
    }

    @Test
    public void testSet() {
        ownArrayList.set(9, 101);
        assertEquals(Integer.valueOf(101), ownArrayList.get(9));
    }

    @Test
    public void testMultiplyArrayLength() {
        ownArrayList = new OwnArrayList<Integer>(3);

        ownArrayList.add(101);
        ownArrayList.add(234);
        ownArrayList.add(363);
        ownArrayList.add(421);

        assertEquals(Integer.valueOf(101), ownArrayList.get(0));
        assertEquals(Integer.valueOf(234), ownArrayList.get(1));
        assertEquals(Integer.valueOf(363), ownArrayList.get(2));
        assertEquals(Integer.valueOf(421), ownArrayList.get(3));
        assertEquals(6, ownArrayList.theArray.length);
    }
}
