import java.util.Arrays;

public class SortedArrayList<T extends Comparable<T>> implements SortedList<T>{

    //data members
    protected int size = 0;
    protected T[] arr;

    //class constructor
    public SortedArrayList() {
        arr = (T[]) new Comparable[10];
        size=0;
    }

    /**
     * adds item to array and grows array if array is full
     * @param item the value added
     */
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

    /**
     * Returns the index of the input
     * @param pos the index checked
     * @return the value at the index input
     */
    @Override
    public T get(int pos) throws Exception {
            if (pos < 0 || pos >= size) {
                throw new Exception("index out of bounds");
            }
            return arr[pos];
    }

    /**
     * Removes and returns the item removed
     * @param pos the position to remove
     * @return the item at the position
     */
    @Override
    public T remove(int pos) throws Exception {
        if (pos < 0 || pos >= size) {
            throw new Exception("index out of bounds");
        }
        T ele = arr[pos];
        for (int i = pos; i < size; i++) {
            arr[i] = arr[i + 1];
        }
        size --;
        return ele;
    }
    /**
     * checks array size
     * @return the size of the array
     */
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
    /**
     * doubles the size of the array
     */
    private void grow_array ()
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
