package ADT;

public interface ListADT<T> {
    /**
     * Adds the specified element to the end of the list.
     * 
     * @param item The element to be added.
     */
    void add(T item);

    /**
     * Removes and returns the element at the specified index.
     * 
     * @param index The index of the element to be removed.
     * @return The removed element.
     * @throws IndexOutOfBoundsException if the index is out of range.
     */
    T remove(int index);

    /**
     * Returns the element at the specified index.
     * 
     * @param index The index of the element to be retrieved.
     * @return The element at the specified index.
     * @throws IndexOutOfBoundsException if the index is out of range.
     */
    T get(int index);

    /**
     * Returns the number of elements in the list.
     * 
     * @return The number of elements in the list.
     */
    int size();
}
