public interface SortedList<T extends Comparable<T>>{

    public void add(T item);

    public T get(int pos) throws Exception;

    public T remove(int pos) throws Exception;

    public int size();

}
