package tests;

import ADT.MyStack;
import ADT.EmptyStackException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyStackTests {

    private MyStack<String> stack;

    @BeforeEach
    public void setUp() {
        stack = new MyStack<>();
    }

    @Test
    public void testPushAndPop() {
        stack.push("Hello");
        stack.push("World");

        assertEquals("World", stack.pop());
        assertEquals("Hello", stack.pop());
    }

    @Test
    public void testPeek() {
        stack.push("Java");
        assertEquals("Java", stack.peek());
        assertEquals(1, stack.size()); // Size should not change after peek
    }

    @Test
    public void testIsEmpty() {
        assertTrue(stack.isEmpty());
        stack.push("Test");
        assertFalse(stack.isEmpty());
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testSize() {
        assertEquals(0, stack.size());
        stack.push("One");
        stack.push("Two");
        assertEquals(2, stack.size());
    }

    @Test
    public void testPopEmptyStack() {
        assertThrows(EmptyStackException.class, () -> stack.pop());
    }

    @Test
    public void testPeekEmptyStack() {
        assertThrows(EmptyStackException.class, () -> stack.peek());
    }
}
