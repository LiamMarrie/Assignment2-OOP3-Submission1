package ADT;

/**
 * This interface represents the abstract data type (ADT) for a queue.
 */
public interface QueueADT<T> {
    /**
     * Adds an element to the back of the queue.
     * 
     * @param element the element to be added to the queue
     * @throws NullPointerException if the element is null
     */
    void enqueue(T element);

    /**
     * Removes and returns an element from the front of the queue.
     * 
     * @return the element removed from the front of the queue
     * @throws EmptyQueueException if the queue is empty
     */
    T dequeue();

    /**
     * Retrieves the element at the front of the queue but does not remove it.
     * 
     * @return the element at the front of the queue
     * @throws EmptyQueueException if the queue is empty
     */
    T peek();

    /**
     * Checks to see if the queue is empty.
     * 
     * @return true if the queue is empty and false if it is not
     */
    boolean isEmpty();

    /**
     * Returns the number of elements in the queue.
     * 
     * @return the size of the queue
     */
    int size();
}
