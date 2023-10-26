package ADT;

/**
 * This interface represents the abstract data type (ADT) for a stack.
 */
public interface StackADT<T> {
    /**
     * Pushes an element onto the top of the Stack.
     * 
     * @param element the element to push onto the Stack
     * @throws NullPointerException if the element is null
     */
    void push(T element);

    /**
     * Removes and returns the element at the top of the stack.
     * 
     * @return element at the top of the stack
     * @throws EmptyStackException if the stack is empty
     */
    T pop();

    /**
     * Retrieves the element at the top of the stack but does not remove it.
     * 
     * @return the element at the top of the stack
     * @throws EmptyStackException if the stack is empty
     */
    T peek();

    /**
     * Checks if the stack is empty.
     * 
     * @return true if the stack is empty and false if it is not
     */
    boolean isEmpty();

    /**
     * Returns the number of elements in the stack.
     * 
     * @return the size of the stack
     */
    int size();
}
