

public class SortedLinkedList<T extends Comparable<T>> implements SortedList<T>{

    protected int size;
    protected Node head;

    public SortedLinkedList() {
        head = null;
        size = 0;
    }

    private class Node<T> {
        T data;
        Node<T> next;
        public Node(T value) {
            data = value;
            next = null;
        }
    }

    @Override
    public void add(T item) {
        if (head == null) {
            head = new Node(item);
        }
        else {
                Node prev = head;
                Node cur = head.next;
                while (item.compareTo((T) prev.data) > 0 && prev.next != null) {
                    prev = cur;
                    cur = cur.next;
                }
                Node node = new Node(item);
                node.next = cur;
                prev.next = node;
            }
        size++;
    }

    @Override
    public T get(int pos) {
        Node curr = head;
        for (int i = 0; i < pos; i++) {
            curr = curr.next;
        }
        return (T) curr.data;
    }

    @Override
    public T remove(int pos) {
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

    @Override
    public int size() {
        return size;
    }


        @Override
    public String toString() {
            String s = "";
            Node cur = head;
            for (int i = 0; i < size; i++) {
                s += cur.data;
                s += ", ";
                cur = cur.next;
            }
            return s;
        }
}
