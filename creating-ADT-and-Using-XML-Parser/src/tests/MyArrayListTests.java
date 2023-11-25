package tests;

import ADT.MyArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class MyArrayListTests {

    private MyArrayList<Integer> list;

    @BeforeEach
    public void setUp() {
        list = new MyArrayList<>();
    }

    @Test
    public void testAddAndGet() {
        list.add(1);
        list.add(2);
        list.add(3);

        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(3, list.get(2));
    }

    @Test
    public void testSize() {
        assertEquals(0, list.size());
        list.add(10);
        assertEquals(1, list.size());
    }

    @Test
    public void testRemove() {
        list.add(5);
        list.add(6);

        int removed = list.remove(0);
        assertEquals(5, removed);
        assertEquals(1, list.size());
        assertEquals(6, list.get(0));
    }

    @Test
    public void testOutOfBounds() {
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(0));
        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(0));
    }
}
