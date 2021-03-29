

public class SortedLinkedList<T extends Comparable<T>> implements SortedList<T>{

    //data members
    protected int size;
    protected Node head;

    //class constructor
    public SortedLinkedList() {
        head = null;
        size = 0;
    }

    //Node class for use in linked list
    private class Node<T> {
        T data;
        Node<T> next;
        public Node(T value) {
            data = value;
            next = null;
        }
    }

    /**
     * adds item to array
     * @param item the value added
     */
    @Override
    public void add(T item) {
        Node node = new Node(item);
        Node cur = head;
        Node prev = null;
        while (cur != null && item.compareTo((T) cur.data) > 0) {
            prev = cur;
            cur = cur.next;
        }
        if (prev == null) {
            head = node;
        }
        else {
            prev.next = node;
        }
        node.next = cur;
        size++;
    }

    /**
     * Returns the index of the input
     * @param pos the index checked
     * @return the value at the pos input
     */
    @Override
    public T get(int pos) throws Exception {
        if (pos < 0 || pos >= size) {
            throw new Exception("index out of bounds");
        }
        Node curr = head;
        for (int i = 0; i < pos; i++) {
            curr = curr.next;
        }
        return (T) curr.data;
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
        if (pos == 0) {
            Node node = head;
            head = head.next;
            size--;
            return (T) node.data;
        } else {
            Node prev = head;
            for (int i = 0; i < pos - 1; i++) {
                prev = prev.next;
            }
            Node node = prev.next;
            prev.next = node.next;
            size--;
            return (T) node.data;
        }
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
            String s = "";
            Node cur = head;
            for (int i = 0; i < size; i++) {
                if (cur != null) {
                    s += cur.data;
                    s += ", ";
                    cur = cur.next;
                }
            }
            return s;
        }
}
