package ADT;

public class MyStack<T> implements StackADT<T> {
    private MyArrayList<T> data;

    public MyStack() {
        this.data = new MyArrayList<>();
    }

    @Override
    public void push(T item) {
        data.add(item);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return data.remove(data.size() - 1);
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return data.get(data.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return data.size() == 0;
    }

    @Override
    public int size() {
        return data.size();
    }
}
