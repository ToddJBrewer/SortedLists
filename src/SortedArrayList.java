import java.util.Arrays;

public class SortedArrayList<T extends Comparable<T>> implements SortedList<T>{

    protected int size = 0;
    protected T[] arr;

    public SortedArrayList() {
        arr = (T[]) new Comparable[10];
        size=0;
    }

    @Override
    public void add(T item) {
        if (size == arr.length) {
            grow_array();
        }
        arr[size] = item;
        for (int i = size; i > 0 && arr[i-1].compareTo(arr[i]) >= 0; i--) {
            T temp = arr[i-1];
            arr[i-1] = arr[i];
            arr[i] = temp;
        }
        size++;

    }

    @Override
    public T get(int pos) {
            if (pos < 0 || pos >= size) {
                throw new UnsupportedOperationException("index out of bounds");
            }
            return arr[pos];
    }

    @Override
    public T remove(int pos) {
        if (pos < 0 || pos >= size) {
            throw new UnsupportedOperationException("index out of bounds");
        }
        T ele = arr[pos];
        for (int i = pos; i < size; i++) {
            arr[i] = arr[i + 1];
        }
        size --;
        return ele;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "SortedArrayList{" +
                "size=" + size +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }

    private void grow_array () //doubles size of array
    {
        int len = arr.length;
        if (len == 0) {
            len++;
        }
        T[] temp = (T[]) new Comparable[len*2];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
    }
}
