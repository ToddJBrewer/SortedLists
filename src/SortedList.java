public interface SortedList<T extends Comparable<T>>{

    public void add(T item);

    public T get(int pos);

    public T remove(int pos);

    public int size();

}
