public class SortedLinkedList<T extends Comparable<T>> implements SortedList<T>{

    protected int size;
    protected Node head;

    public SortedLinkedList() {
        head = new Node(null);
        int size = 0;
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
        Node temp = new Node(item);
        temp.next = null;
        if (head == null) {
            head.next = temp;
            size++;
        } else {
            Node prev = head;
            while (prev.next != null) {
                prev = prev.next;
            }
            prev.next = temp;
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
            for (int i = 0; i < size+1; i++) {
                s += cur.data;
                s += ", ";
                cur = cur.next;
            }
            return s;
        }
}
