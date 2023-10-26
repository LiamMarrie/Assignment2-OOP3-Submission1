package ADT;

public class MyArrayList<T> implements ListADT<T> {
    private Object[] data;
    private int size;

    public MyArrayList() {
        this.data = new Object[10];
        this.size = 0;
    }

    @Override
    public void add(T item) {
        if (size == data.length) {
            resize(2 * data.length);
        }
        data[size] = item;
        size++;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        T removedItem = (T) data[index];
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[size - 1] = null;
        size--;
        return removedItem;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (T) data[index];
    }

    @Override
    public int size() {
        return size;
    }

    private void resize(int newCapacity) {
        Object[] newData = new Object[newCapacity];
        System.arraycopy(data, 0, newData, 0, size);
        data = newData;
    }
}
